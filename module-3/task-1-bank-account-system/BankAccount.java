public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    private static int totalAccountsCreated = 0;

    public static final String BANK_NAME =
            "TechBank International";

    public BankAccount() {
        this("Unknown", "Unknown", 0);
    }

    public BankAccount(
            String accountNumber,
            String accountHolder,
            double balance
    ) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }

        totalAccountsCreated++;
    }

    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println(
                    "Deposit successful: $" + amount
            );

        } else {

            System.out.println(
                    "Deposit amount must be greater than 0."
            );
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println(
                    "Withdrawal amount must be greater than 0."
            );

        } else if (amount > balance) {

            System.out.println(
                    "Not enough balance."
            );

        } else {

            balance -= amount;

            System.out.println(
                    "Withdrawal successful: $" + amount
            );
        }
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccountsCreated() {
        return totalAccountsCreated;
    }

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount(
                        "A1001",
                        "Josvier",
                        1000
                );

        account1.deposit(500);

        account1.withdraw(200);

        System.out.println(
                "Balance: $" + account1.getBalance()
        );

        System.out.println(
                "Bank: " + BANK_NAME
        );

        System.out.println(
                "Accounts created: "
                        + getTotalAccountsCreated()
        );
    }
}
