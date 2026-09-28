# Task 3

## Question

(Student Grade Management Model): Design a `Student` class with fields `studentId`, `name`, and `double[] grades`. Include methods `addGrade(double grade)`, `calculateGPA()`, and a static helper method `isHonorStudent(double gpa)`. 6.

## How I understand it

I store the student information and the grades inside the object. Every time I add a grade, I validate that it is between 0 and 100. To calculate the GPA, I first get the average of all the grades and convert it to a 4.0 scale. Then I use the static method to check if the GPA is at least 3.5.

## Verified output

```text
GPA: 3.65
Honor Student: true
```
