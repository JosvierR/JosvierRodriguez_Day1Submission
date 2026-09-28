# Task 1

## Question

(Enterprise E-Commerce Payment Gateway System Design Project): Design and architect the full system: • Interface `PaymentProcessor`: Methods `boolean processPayment(double amount)` and `void refundPayment(double amount)`. • Interface `AuditLogger`: Method `void logTransaction(String transactionDetails)`. • Abstract Class `BasePaymentGateway`: Implements `PaymentProcessor`, contains shared fields (`merchantId`, `transactionFee`), concrete logging helper, and abstract method `validateCredentials()`. • Concrete Subclasses: `CreditCardPaymentGateway`, `PayPalPaymentGateway`, `CryptoPaymentGateway` extending `BasePaymentGateway`. • Interface Implementation: `DatabaseLogger` implementing `AuditLogger` and injected into payment gateways. • Client Service: `PaymentService` executing payments dynamically via dynamic references.

## How I understand it

I created one payment interface that every payment type follows. The abstract class keeps the things they all share, and each payment gateway has its own implementation. PaymentService only depends on the interface, so I can change from Credit Card to PayPal or Crypto without changing the service. That's basically abstraction and loose coupling.

## Verified output

```text
LOG: Credit Card payment: $103.0
Payment successful: true
LOG: Credit Card refund: $50.0
```
