# Task 3

## Question

(Array Element Frequency Counter): Write a method `countFrequencies(int[] arr)` that processes an array of integers and outputs the count of each distinct element without using high-level framework collection abstractions. 4.

## How I understand it

For this task, I basically go through the array and count how many times each number appears. Since I am not using a HashMap, I use another array to remember which positions I already counted. I compare each number with the rest, increase the count when I find the same value, and mark repeated positions so I do not count them again.

## Verified output

```text
1 appears 2 time(s)
2 appears 3 time(s)
3 appears 4 time(s)
4 appears 1 time(s)
```
