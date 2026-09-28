# Task 1

## Question

(Employee Payroll Hierarchy): Build an inheritance hierarchy: • Base class: `Employee` with attributes `id`, `name`, `baseSalary`, and method `calculatePay()`. • Derived class 1: `FullTimeEmployee` (adds `annualBonus`, overrides `calculatePay()`). • Derived class 2: `Contractor` (adds `hourlyRate`, `hoursWorked`, overrides `calculatePay()`). • Write a test script storing mixed objects in an `Employee[]` array and iterating through them to call `calculatePay()` polymorphically.

## How I understand it

I have one parent class Employee and two different types of employees. Each one calculates the pay differently, so they override the same method. I can put both inside an Employee array and Java automatically uses the correct calculatePay() for each one. That is basically polymorphism.

## Verified output

```text
John Pay: $65000.0
Sarah Pay: $6400.0
```
