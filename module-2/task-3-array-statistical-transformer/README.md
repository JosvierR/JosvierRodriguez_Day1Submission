# Task 3

## Question

(Array Statistical Transformer): Implement a method `processScores(double[] scores)` that calculates mean, median, and standard deviation of an array, returning a structured summary or printing formatted results. 5.

## How I understand it

I take the scores and calculate three things: the average, the middle value, and how spread out the scores are from the average. For the median, I sort a copy of the array so I do not change the original one.

## Verified output

```text
Scores: [85.0, 90.0, 72.0, 88.0, 95.0, 76.0]
Mean: 84.33
Median: 86.50
Standard Deviation: 7.97
```
