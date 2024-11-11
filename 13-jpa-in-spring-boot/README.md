# Spring Boot with JPA

The exercises in this project are designed to help you understand integrating
JPA with Spring Boot to create a complete database-backed REST API.  It will
also demonstrate a complete Spring Boot REST API application that uses JPA to
interact with a mysql database.

## Getting Started

To get started, open the project file located in `jpa-in-spring-boot/pom.xml`
in IntelliJ.

## Project Overview 

This project contains a Spring Boot application with the necessary dependencies
to create a REST API backed by a mysql database.

You will be implementing most of the application yourself in this project
using both the knowledge that you have gained from the previous exercises and
the JPA skills that you learned throughout this lesson.

## Exercise

This exercise has many steps and will take some time to complete.  This readme
will guide you through the steps to complete the exercise.

### Step 1: Create the Database

The first step is to create the database that the application will use.  You
will need to open up mysql workbench, and then choose `File -> Open SQL Script`
and open the file located in `jpa-in-spring-boot/sql/create-database.sql`.

This script contains the SQL commands to create the database and the tables
that the application will use, as well as some initial data to populate the
tables.  You should review this script and then run it to create the database.

To verify that the database was created correctly, you can open a new query
tab in mysql workbench and run the following SQL command:

```sql
select * from todo_lists;
```

This should return a list of todo lists that were created by the script.

### Step 2: Open and Review the Spring Boot Application

Next, you should open the project located in `jpa-in-spring-boot/pom.xml`
in IntelliJ and review the code that it current contains:

- `src/main/java/org.example/SpringBootApplication.java` - This is the main
  class for the Spring Boot application.  This is a very short, standard
  spring boot application class that starts up a Spring Boot application.
  You will not need to modify this class.
- `pom.xml` - This is the project file for the Spring Boot application. Most
  notably, it contains the mysql driver and the JPA dependencies that allow
  the application to connect to the database and use JPA to interact with it.
  This dependency also requires that you have a `application.properties` file
  with the database connection information properly configured.
- `src/main/resources/application.properties` - This file contains the 
  configuration for the database connection.  You will need to update the
  `spring.datasource.username`, and `spring.datasource.password` properties to
  match the username and password that you use to connect to your mysq server.

With this configured properly, you should be able to run the application by
right-clicking on the `SpringBootApplication` class and selecting `Run`.

The REST endpoints do not respond properly yet, so you will not be able to
test them yet, but you should see that the application starts up without any
errors and that the endpoints are registered and responding with 404 errors.

### Step 3: Populate the Model Classes

The next step is to complete the model classes that will represent the data
from the database. The model classes are included with this project, but they
are curently empty.  You will need to add the following items to each of the
model classes:

- private fields for each column in the table
- a no-argument constructor
- a constructor that takes all of the fields as arguments and sets them
- getters and setters for each field

### Step 4: Populate the Controller Classes

The next step is to create the controller classes that will handle the REST
endpoints for the application.  You will need to create a controller class
for each of the two model class that you created in the previous step.

Each controller class should have methods for each of the following REST
endpoints:

- `GET /` - This should return a list of all of the items in the table
- `GET /{id}` - This should return a single item from the table with the
  specified id
- `POST /` - This should create a new item in the table
- `PUT /{id}` - This should update an existing item in the table
- `DELETE /{id}` - This should delete an existing item in the table

The controller classes are already created with stub methods for each of these
endpoints.  You will need to implement the methods to interact with the
database using JPA through the included `jdbcTemplate` member of the class.
You will need to execute the appropriate SQL queries and then map the results
to the model classes that you created in the previous step.

## Testing / Verification

You can verify that the application is working correctly by running the
application and then launching Postman to test the REST endpoints.  You should
be able to create, read, update, and delete items in the database using the
REST endpoints that you created.

