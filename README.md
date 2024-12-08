# Java ArithmeticException: Division by Zero

This repository demonstrates a common error in Java: the `ArithmeticException` that occurs when dividing by zero. The `Bug.java` file contains the erroneous code, while `BugSolution.java` provides a corrected version.

## Bug Description

The `Bug.java` file attempts to divide an integer by zero, leading to an `ArithmeticException` at runtime.  This is a very common error when dealing with integer arithmetic. 

## Solution

The `BugSolution.java` file demonstrates how to prevent this error by adding a check to ensure the divisor is not zero before performing the division.  If the divisor is zero, it will avoid the division process and optionally display an error message, handle it gracefully, or return a default value.

## How to Run

1. Clone this repository.
2. Compile and run both `Bug.java` and `BugSolution.java` using a Java compiler (like the one included in the JDK).

Observe the difference in output and behavior.