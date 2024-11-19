# Hands-On Example: Building a CRUD API

- building a simple CRUD API to manage User entities.

## Testing the API endpoints in the postman

```commandline

1. Create a User:

Method: POST
URL: http://localhost:8080/api/users
Body: { "id": 1, "name": "John", "email": "john@example.com" }


2. Get All Users:

Method: GET
URL: http://localhost:8080/api/users


3. Get User by ID:

Method: GET
URL: http://localhost:8080/api/users/1

4. Update a User:

Method: PUT
URL: http://localhost:8080/api/users/1
Body: { "id": 1, "name": "John Updated", "email": "john.updated@example.com" }

5. Delete a User:

Method: DELETE
URL: http://localhost:8080/api/users/1


```