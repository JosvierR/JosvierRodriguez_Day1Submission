# Task 2

## Question

(Library Book Inventory Tracker): Create a `Book` class with fields `isbn`, `title`, `author`, `isBorrowed`. Implement parameterized constructors, getters/setters with validation (e.g., non-empty title/ISBN), and methods `borrowBook()` and `returnBook()`.

## How I understand it

I keep the book information private and use setters to validate important values like the title and ISBN. isBorrowed tells me the current state of the book. When I borrow it, I change that value to true. When I return it, I change it back to false.

## Verified output

```text
Java Basics has been borrowed.
Java Basics has been returned.
```
