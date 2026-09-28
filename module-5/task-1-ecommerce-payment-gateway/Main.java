interface PaymentProcessor {

    boolean processPayment(double amount);

    void refundPayment(double amount);
}

interface AuditLogger {

    void logTransaction(String transactionDetails);
}

class DatabaseLogger implements AuditLogger {

    @Override
    public void logTransaction(String transactionDetails) {

        System.out.println(
            "LOG: " + transactionDetails
        );
    }
}

abstract class BasePaymentGateway
        implements PaymentProcessor {

    protected String merchantId;
    protected double transactionFee;

    protected AuditLogger logger;

    public BasePaymentGateway(
            String merchantId,
            double transactionFee,
            AuditLogger logger
    ) {

        this.merchantId = merchantId;
        this.transactionFee = transactionFee;
        this.logger = logger;
    }

    protected void log(String message) {

        logger.logTransaction(message);
    }

    public abstract boolean validateCredentials();
}

class CreditCardPaymentGateway
        extends BasePaymentGateway {

    public CreditCardPaymentGateway(
            String merchantId,
            AuditLogger logger
    ) {

        super(
            merchantId,
            0.03,
            logger
        );
    }

    @Override
    public boolean validateCredentials() {
        return merchantId != null;
    }

    @Override
    public boolean processPayment(double amount) {

        if (!validateCredentials() || amount <= 0) {
            return false;
        }

        double total =
            amount + (amount * transactionFee);

        log(
            "Credit Card payment: $"
            + total
        );

        return true;
    }

    @Override
    public void refundPayment(double amount) {

        log(
            "Credit Card refund: $"
            + amount
        );
    }
}

class PayPalPaymentGateway
        extends BasePaymentGateway {

    public PayPalPaymentGateway(
            String merchantId,
            AuditLogger logger
    ) {

        super(
            merchantId,
            0.02,
            logger
        );
    }

    @Override
    public boolean validateCredentials() {
        return merchantId != null;
    }

    @Override
    public boolean processPayment(double amount) {

        if (!validateCredentials() || amount <= 0) {
            return false;
        }

        double total =
            amount + (amount * transactionFee);

        log(
            "PayPal payment: $"
            + total
        );

        return true;
    }

    @Override
    public void refundPayment(double amount) {

        log(
            "PayPal refund: $"
            + amount
        );
    }
}

class CryptoPaymentGateway
        extends BasePaymentGateway {

    public CryptoPaymentGateway(
            String merchantId,
            AuditLogger logger
    ) {

        super(
            merchantId,
            0.01,
            logger
        );
    }

    @Override
    public boolean validateCredentials() {
        return merchantId != null;
    }

    @Override
    public boolean processPayment(double amount) {

        if (!validateCredentials() || amount <= 0) {
            return false;
        }

        double total =
            amount + (amount * transactionFee);

        log(
            "Crypto payment: $"
            + total
        );

        return true;
    }

    @Override
    public void refundPayment(double amount) {

        log(
            "Crypto refund: $"
            + amount
        );
    }
}

class PaymentService {

    private PaymentProcessor processor;

    public PaymentService(
            PaymentProcessor processor
    ) {

        this.processor = processor;
    }

    public void makePayment(double amount) {

        boolean success =
            processor.processPayment(amount);

        System.out.println(
            "Payment successful: "
            + success
        );
    }
}

public class Main {

    public static void main(String[] args) {

        AuditLogger logger =
            new DatabaseLogger();

        PaymentProcessor creditCard =
            new CreditCardPaymentGateway(
                "MERCHANT-001",
                logger
            );

        PaymentService service =
            new PaymentService(
                creditCard
            );

        service.makePayment(100);

        creditCard.refundPayment(50);
    }
}
