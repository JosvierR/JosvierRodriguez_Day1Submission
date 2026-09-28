# Task 1

## Question

(Encapsulated BankAccount System): Design a `BankAccount` class containing: • Private attributes: `accountNumber`, `accountHolder`, `balance`. • Static attribute: `totalAccountsCreated` (increments on every new instance). • Constant: `BANK_NAME = 'TechBank International'` (using `final`/`readonly`). • Default constructor and overloaded parameterized constructor using `this(...)` chaining. • Methods: `deposit(double amount)`, `withdraw(double amount)` with validation rules (no negative balance or invalid deposits).

## How I understand it

I made the account information private so it cannot be changed directly from outside. The constructor gives every new account its starting values. The static counter is shared by every account, so I use it to know how many accounts were created. For deposits and withdrawals, I check the values first so I do not allow invalid amounts or a negative balance.

## Verified output

```text
Deposit successful: $500.0
Withdrawal successful: $200.0
Balance: $1300.0
Bank: TechBank International
Accounts created: 1
```
