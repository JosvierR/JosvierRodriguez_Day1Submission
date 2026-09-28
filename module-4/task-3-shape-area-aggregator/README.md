# Task 3

## Question

(Shape Hierarchy & Area Aggregator): Design a superclass `Shape` with a method `calculateArea()`. Create subclasses `Circle`, `Rectangle`, and `Triangle`. Write a manager class with a method `double calculateTotalArea(Shape[] shapes)` that returns the combined area. 7.

## How I understand it

I have one parent class called Shape, and every shape calculates its area differently. I put all the shapes inside the same array and just call calculateArea(). Java knows which version to use depending on the real object. That is runtime polymorphism.

## Verified output

```text
Total Area: 122.54
```
