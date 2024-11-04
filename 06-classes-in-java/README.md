# Classes in Java 

The exercises in this project are designed to help you understand classes in Java, as well as to give you
experience working with multiple classes in a single project, and exposing you to a complete application
that is properly documented with Javadoc comments.

## Getting Started

To get started, open the project file located in `classes-in-java/pom.xml` in IntelliJ.

## Exercises

This project contains a command-line application for managing student and teacher lists.  This is the first time that
you'll be working with a slighly larger project with multiple classes, so you are encouraged to take your time and
read through the code to understand how the classes interact with each other.

You should also look at the /* JavaDoc */ comments in the code to understand both how to properly write JavaDoc comments
to document your code, and to understand how to read JavaDoc comments to understand code that you did not write.

The `Main` class contains the main method that runs the application.  You will not need to modify this class at all,
though you are encouraged to look through it to understand how the application works.

The `Student` class contains the code for a student.  There are several todo items in this class that you will need to
complete:

- Add instance variables for the student's first name, last name, class number, and class name.
- Fill in getters and setters for the instance variables with the appropriate code.
- Fill in the constructor to set the instance variables to the values passed in as parameters.
- Fill in the `toString` method to return a string representation of the student.

The `Teacher` class contains the code for a teacher.  There are several todo items in this class that you will need to
complete:

- Add instance variables for the teacher's first name, last name, and subject.
- Fill in getters and setters for the instance variables with the appropriate code.
- Fill in the constructor to set the instance variables to the values passed in as parameters.
- Fill in the `toString` method to return a string representation of the teacher.

## Running the Tests

To run the tests, right-click on the `test/java/org.example/src/ExerciseTests` class and select "Run 'ExercisesTests'".
This will run all of the tests for the exercises. When a test succeeds, you will see a green checkmark next to the test.
When a test fails, you will see a red X next to the test.  Once all of the tests pass, you have completed the exercises.

