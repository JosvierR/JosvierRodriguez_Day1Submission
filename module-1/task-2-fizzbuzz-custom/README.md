# Task 2

## Question

(FizzBuzz Custom): Write a loop that prints numbers from 1 to 50, but prints 'Fizz' for multiples of 3, 'Buzz' for multiples of 5, and 'FizzBuzz' for multiples of both 3 and 5.

## How I understand it

I use % to check the remainder. If i % 3 == 0, there is no remainder when dividing by 3, so the number is a multiple of 3. Same thing for 5. The important part is checking the condition for both 3 and 5 first, because a number like 15 should print FizzBuzz instead of only Fizz or Buzz.

## Verified output

```text
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
Fizz
22
23
Fizz
Buzz
26
Fizz
28
29
FizzBuzz
31
32
Fizz
34
Buzz
Fizz
37
38
Fizz
Buzz
41
Fizz
43
44
FizzBuzz
46
47
Fizz
49
Buzz
```
