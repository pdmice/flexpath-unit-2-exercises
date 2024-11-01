# Creating a Library Database

## Introduction

In this exercise, you will use your knowledge of mysql and database creation to author
a script to create a database for a library. The database will contain tables for books,
authors, members, loans, and genres.  Your database creation script will create these 
tables and populate them with sample data.

## Project Layout

To begin this project, you should launch IntelliJ and open the project by selection the
`creating-databases/pom.xml` file located in this folder.

Once the project is loaded, you will see a file located at `src/main/resources/create-database.sql`
This file contains the SQL script that you will author to create the database, and
this exercise will only require you to modify this file.

## Testing Your Work

In order to test your work as you go, you can right-click the `src/test/java/TestCreateScript.java`
file in the IntelliJ project explorer and select "Run TestCreateScript". This will run the unit
tests for this exercise, that will verify that your database creation script is correct and
complete.  Once you run the test, you will see the results in the "Run" tab at the bottom of the
IntelliJ window.  In the list of test results, passing tests will be prefixed with a green checkmark
and failing tests will be prefixed with a red "x".  Once all tests pass, you have completed the
exercise.

## Database Table Creation

The first step in this exercise is to write a series of `CREATE TABLE` statements in the script
that will create all of the tables described below.  Remember to end each `CREATE TABLE` statement
with a semicolon `;`.

The first field in each table should be an auto-incrementing primary key field.  You should use
the names and descriptions of the fields in the tables below to find appropriate foreign keys.

All fields should be non-nullable unless otherwise specified.

You will need to create the tables with appropriate types, primary keys and foreign keys in order
for all of the tests to pass and for the exercise to be completed.

### Books

The `books` table will contain information about books in the library.

| field            | type         | description                                     |
| ---------------- | ------------ | ----------------------------------------------- |
| book_id          | INT          | The unique identifier for the book              |
| title            | VARCHAR(255) | The title of the book                           |
| author_id        | INT          | The unique identifier of the author of the book |
| genre_id         | INT          | The unique identifier of the genre of the book  |
| publication_year | INT          | The year the book was published                 |

### Authors

The `authors` table will contain information about authors of books in the library.

| field      | type         | description                          |
| ---------- | ------------ | ------------------------------------ |
| author_id  | INT          | The unique identifier for the author |
| name       | VARCHAR(255) | The name of the author               |
| birth_year | INT          | The year the author was born         |
| country    | VARCHAR(255) | The country the author is from       |

### Members

The `members` table will contain information about members of the library.

| field      | type         | description                            |
| ---------- | ------------ | -------------------------------------- |
| member_id  | INT          | The unique identifier for the member   |
| name       | VARCHAR(255) | The name of the member                 |
| join_date  | DATE         | The date the member joined the library |

### Loans

The `loans` table will contain information about loans of books to members.

| field      | type         | description                            |
| ---------- | ------------ | -------------------------------------- |
| loan_id    | INT          | The unique identifier for the loan     |
| book_id    | INT          | The unique identifier of the book      |
| member_id  | INT          | The unique identifier of the member    |
| loan_date  | DATE         | The date the book was loaned           |
| return_date| DATE or NULL | The date the book was returned         |

### Genres

The `genres` table will contain information about genres of books in the library.

| field      | type         | description                             |
| ---------- | ------------ | --------------------------------------- |
| genre_id   | INT          | The unique identifier for the genre     |
| name       | VARCHAR(255) | The name of the genre                   |

## Populating the Tables

Once you have created the tables, you will need to populate them with sample data.  You should
write a series of `INSERT INTO` statements in the script after the `CREATE TABLE` statements
that will insert data into each of the tables.  Remember to end each `INSERT INTO` statement
with a semicolon `;`.

### Books

| book_id | title                 | author_id | genre_id | publication_year |
| ------- | --------------------- | --------- | -------- | ---------------- |
| 1       | The Great Gatsby      | 1         | 1        | 1925             |
| 2       | To Kill a Mockingbird | 2         | 2        | 1960             |
| 3       | 1984                  | 3         | 3        | 1949             |
| 4       | Pride and Prejudice   | 4         | 4        | 1813             |
| 5       | The Catcher in the Rye| 5         | 5        | 1951             |


### Authors

| author_id | name           | birth_year | country |
| --------- | -------------- | ---------- | ------- |
| 1         | F. Scott Fitzgerald | 1896   | USA     |
| 2         | Harper Lee          | 1926   | USA     |
| 3         | George Orwell       | 1903   | UK      |
| 4         | Jane Austen         | 1775   | UK      |
| 5         | J.D. Salinger       | 1919   | USA     |

### Members

| member_id | name           | join_date |
| --------- | -------------- | --------- |
| 1         | Alice Smith    | 2020-01-01 |
| 2         | Bob Johnson    | 2020-01-15 |
| 3         | Charlie Brown  | 2020-02-01 |


### Loans

| loan_id | book_id | member_id | loan_date | return_date |
| ------- | ------- | --------- | --------- | ----------- |
| 1       | 1       | 1         | 2020-01-01 | 2020-01-15  |
| 2       | 2       | 2         | 2020-01-15 | 2020-02-01  |
| 3       | 3       | 3         | 2020-02-01 | NULL        |

### Genres

| genre_id | name      |
| -------- | --------- |
| 1        | Fiction   |
| 2        | Mystery   |
| 3        | Dystopian |
| 4        | Romance   |
| 5        | Coming of Age |


## Conclusion

Once you have authored the `create-database.sql` script to create the database and populate it
with sample data, you can run the tests to verify that your script is correct and complete.  Once
all tests pass, you have completed the exercise.

Good luck!

