# Task 1

## Question

(Method Overloading Utility): Create a class `AreaCalculator` with three overloaded methods named `calculateArea()`: • `calculateArea(double radius)` -> computes circle area • `calculateArea(double width, double height)` -> computes rectangle area • `calculateArea(double base, double height, boolean isTriangle)` -> computes triangle area.

## How I understand it

For this task I made three methods with the same name, calculateArea, but each one receives different parameters. Java knows which one to use depending on what I pass to it. That is method overloading.

## Verified output

```text
Circle Area: 78.53981633974483
Rectangle Area: 24.0
Triangle Area: 20.0
```
