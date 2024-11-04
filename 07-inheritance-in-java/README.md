# Zoo Management System

The exercises in this project are designed to help you understand inheritance in Java, 

## Getting Started

To get started, open the project file located in `inheritance-in-java/pom.xml` in IntelliJ.

## Project Overview 

This project contains a command-line application for interacting with animals in a zoo.  This is
the first project where you will be required to create new classes in the project.

Because some classes are missing, you will need to uncomment a section in the `Main` class and 
in the `ExerciseTests` class to integrate the new class into the application and associated tests.

The `Main` class contains the main method that runs the application.  Other than the uncommenting
mentioned above, you will not need to modify this class at all, though you are, as always,
encouraged to look through it to understand how the application works.

The `Animal` class contains the code for an abstract animal.  You will not need to modify this class,
but you should look at the code to understand how an abstract class is defined and how it is used.
This exercise will involve creating new classes that extend the `Animal` class.

## Exercise

To complete this exercise, you will need to create three new classes that extend the `Animal` class.  
Each of these classes, will require creating a new file in the `src/main/java/org.example/src` directory
and implementing a class derived from the `Animal` class.

### Elephant

The `Elephant` class will represent an elephant.  To create this class, you'll need to:

1. Create a new class in the `src/main/java/org.example/src` directory called `Elephant`
2. Have the `Elephant` class extend the `Animal` class
3. Add a constructor that takes a `name` parameter and calls the constructor of the `Animal` class.
    If you hover your mouse over the red-underlined class declaration, you will see a lightbulb that
    will allow you to automatically add this constructor.
4. Implement the abstract `speak` method to return a String made up of `name + " makes a trumpet sound."`
    Notice that this method makes use of the `name` instance variable that is defined in the parent
    `Animal` class.
5. Uncomment the `elephant` section in the `Main` class to add an elephant to the zoo.
6. Uncomment the `elephant` section in the `ExerciseTests` class to add tests for the `Elephant` class.
7. Run the application and go through all of the options to see that the two defined elephants are
    properly behaving as you indicated.
8. Run the tests to verify that the `Elephant` class is implemented correctly.

### Lion

1. Create a new class in the `src/main/java/org.example/src` directory called `Lion`
2. Have the `Lion` class extend the `Animal` class
3. Add a constructor that takes a `name` parameter and calls the constructor of the `Animal` class.
    If you hover your mouse over the red-underlined class declaration, you will see a lightbulb that
    will allow you to automatically add this constructor.
4. Implement the abstract `speak` method to return a String made up of `name + " lets out a loud ROAR!"`
5. Override the `sleep` method to return the result of calling the `super.sleep` method and appending
    `" " + name + " dreams of a delicious steak."` to the end of the result.
6. Uncomment the `lion` section in the `Main` class to add an lion to the zoo.
7. Uncomment the `lion` section in the `ExerciseTests` class to add tests for the `Lion` class.
8. Run the application and go through all of the options to see that the two defined lions are
    properly behaving as you indicated.
9. Run the tests to verify that the `Lion` class is implemented correctly.

### Parrot

1. Create a new class in the `src/main/java/org.example/src` directory called `Parrot`
2. Have the `Parrot` class extend the `Animal` class
3. Add a constructor that takes a `name` parameter and calls the constructor of the `Animal` class.
    If you hover your mouse over the red-underlined class declaration, you will see a lightbulb that
    will allow you to automatically add this constructor.
4. Implement the abstract `speak` method to return a String made up of `name + " says '" + name + " wants a cracker!'"`
5. Override the `eat` method to return `name + " is eating a cracker."`
6. Add a new method called `fly` that returns `name + " is flying around the zoo."`
7. Uncomment the `parrot` section in the `Main` class to add an parrot to the zoo.
8. Uncomment the `parrot` section in the `ExerciseTests` class to add tests for the `Parrot` class.
9. Run the application and go through all of the options to see that the two defined parrots are
    properly behaving as you indicated.
10. Run the tests to verify that the `Parrot` class is implemented correctly.


## Running the Application

To run the application, right-click on the `src/main/java/org.example/src/Main` class and select "Run 'Main.main()'".
This will run the application and you will be able to interact with it in the console.

## Running the Tests

As always, final verification of your code should be done by running the unit tests.

To run the tests, right-click on the `test/java/org.example/src/ExerciseTests` class and select "Run 'ExercisesTests'".
This will run all of the tests for the exercises. When a test succeeds, you will see a green checkmark next to the test.
When a test fails, you will see a red X next to the test.  Once all of the tests pass, you have completed the exercises.

