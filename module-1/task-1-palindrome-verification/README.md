# Task 1

## Question

(Palindrome Verification): Write a method `isPalindrome(String input)` that returns `true` if the input string is a palindrome (ignoring casing and non-alphanumeric characters) using a two-pointer technique. Do not use built-in string reverse methods.

## How I understand it

I start with two positions: one starts at the beginning and one starts at the end. I start comparing and then I move one place and keep doing it until the two pointers meet. If I find two characters that are not the same, then I know it is not a palindrome. I also skip spaces and commas using Character.isLetterOrDigit(), and I convert the characters to lower case.

## Verified output

```text
racecar -> true
A man, a plan, a canal: Dominican Republic -> false
hello -> false
```
