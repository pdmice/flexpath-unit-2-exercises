# Unit Testing in Java

The exercises in this project are designed to help you understand unit testing
in Java.

## Getting Started

To get started, open the project file located in `java-unit-testing/pom.xml` in
IntelliJ.

## Project Overview 

This project contains two application classes:

- `Calculator` - A simple calculator class that contains methods for adding,
  subtracting, multiplying, and dividing two numbers.
- `Account` - A simple account class that contains methods for depositing and
  withdrawing money from an account.

This project also contains two test classes for testing each of the application
classes:

- `CalculatorTests` - Contains tests for the `Calculator` class.
- `AccountTests` - Contains tests for the `Account` class.

## Exercise

To complete this exercise, you will need to complete the test classes to
contain appropriate tests for the `Calculator` and `Account` classes.

To write these tests, make sure you read the comments in the application
classes to understand what each method is supposed to do. Then, write tests
that verify that the methods work as expected.

### CalculatorTests

The `CalculatorTests` class contains tests for the `Calculator` class. You will
need to write a test for all of the operations. 

The `Calculator` class contains only methods, and no state. This means that
your test should generally only need to call the method and verify that the
return value is correct.

You should specifically take care when writing the `Divide` test to ensure
that you are testing for the correct behavior when dividing by zero (an
exception should be thrown).

### AccountTests

The `AccountTests` class contains tests for the `Account` class. You will need
to write tests for the `deposit` and `withdraw` methods.

The `Account` class contains state (the balance of the account), so you will
need to write tests that call the methods, and then verify the return value
if there is one, and the `balance` of the account after the method is called.

This class has a particular problem with the `withdraw` method that your test
should catch.  When your test failes on this condition, you should fix the
`Account` class to handle this case correctly.

## Running the Tests

As always, final verification of your code should be done by running the unit
tests.  This project is a bit different from the previous projects in that 
you are creating the tests yourself.  This means that the only real way to
verify that your tests are correct is to consider the expected behavior of
the methods you are testing and make sure that your tests verify that behavior.
