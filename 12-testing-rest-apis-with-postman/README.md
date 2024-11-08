# Testing APIs with Postman

The exercises in this project are designed to help you understand using Postman
to test REST APIs.

## Getting Started

To get started, open the project file located in `spring-boot-and-mvc/pom.xml`
in IntelliJ, and open Postman on your desktop.

## Project Overview 

This project contains a simple Spring Boot application.  You will not need to
modify the code in this project, you will just be using Postman to test the
REST endpoints.

## Exercise

For this exercise, you will be testing the REST endpoints in the provided
Spring Boot application using Postman.

You will need to load the project located in
`testing-rest-apis-with-postman/pom.xml` in IntelliJ.  To run the project, you
should right-click on the `SpringBootApplication` class and select `Run`.

Once the application is running, you can use Postman to test the REST endpoints
listed below.

You should create a new collection in Postman to store the requests for this
exercise and set up each request as a new request in the collection, so that
you can easily start up postman later and load and rerun the requests.

### GET `http://localhost:8080/shopping`

This endpoint should return a list of shopping items in JSON format. You can
set up this request as a simple GET request in Postman, by providing the URL.

```json
[
    {
        "id": 1,
        "title": "Milk",
        "price": 2.99,
        "quantity": 1
    },
    {
        "id": 2,
        "title": "Bread",
        "price": 1.99,
        "quantity": 2
    },
    {
        "id": 3,
        "title": "Eggs",
        "price": 3.99,
        "quantity": 1
    },
    {
        "id": 4,
        "title": "Butter",
        "price": 2.49,
        "quantity": 1
    },
    {
        "id": 5,
        "title": "Cheese",
        "price": 4.99,
        "quantity": 1
    }
]
```

### GET `http://localhost:8080/shopping/1`

This endpoint should return a single shopping item in JSON format. You can set
up this request as a simple GET request in Postman, by providing the URL.

```json
{
    "id": 1,
    "title": "Milk",
    "price": 2.99,
    "quantity": 1
}
```
Try testing this endpoint with different IDs to see the results.

### POST `http://localhost:8080/shopping`

This endpoint should allow you to add a new shopping item. You can set up this
request as a POST request in Postman, by providing the URL and the JSON data
for the new shopping item.

```json
{
    "id": 6,
    "title": "Apples",
    "price": 1.99,
    "quantity": 3
}
```
After sending the request, try testing the `GET http://localhost:8080/shopping`
endpoint to verify that the new item was added.

### PUT `http://localhost:8080/shopping/6`

This endpoint should allow you to update an existing shopping item. You can set
up this request as a PUT request in Postman, by providing the URL and the JSON
data for the updated shopping item.

(Run this request after adding the new item in the previous step)

```json
{
    "id": 6,
    "title": "Apples",
    "price": 0.99,
    "quantity": 5
}
```
After sending the request, try testing the `GET http://localhost:8080/shopping`
endpoint to verify that the item was updated with the new quantity and price.

### DELETE `http://localhost:8080/shopping/6`

This endpoint should allow you to delete an existing shopping item. You can set
up this request as a DELETE request in Postman, by providing the URL.

(Run this request after updating the item in the previous step)

After sending the request, try testing the `GET http://localhost:8080/shopping`
endpoint to verify that the item was deleted.

## Testing / Verification

There are no tests for this exercise. You can verify that your work is correct
based on the end points returning the expected results in postman.

