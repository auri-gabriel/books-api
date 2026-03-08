# 📚 Book API

This is a RESTful API for managing books, built with Spring Boot. It supports full CRUD operations with pagination, user creation, and interactive Swagger documentation.

---

## 🚀 Features

- Create, list, update, and delete books  
- Pagination support  
- User creation for authentication  
- Swagger UI (protected)  
- Input validation using Jakarta Validation  

---

## 🛠️ Tech Stack

- Java + Spring Boot  
- Spring Data JPA  
- Spring Validation  
- Swagger (OpenAPI)  
- H2 / PostgreSQL (configurable)  
- Maven  

---

## ▶️ Running the Project

### Prerequisites

- Java 17+  
- Maven  

### Steps

1. Clone the repository:  
   `git clone https://github.com/auri-gabriel/books-api.git`  
   `cd book-api`  

2. Build and run:  
   `./mvnw spring-boot:run`  

---

## 🧪 Testing the API

### Create a user

Before using the API or accessing Swagger, create a user:

```
curl -X POST http://localhost:8080/users \ 
-H "Content-Type: application/json" \
-d '{"username": "admin", "password": "admin"}'
```

You will get a response like:

`{"id":1,"username":"admin"}`

---

### Accessing Swagger

Visit:  
http://localhost:8080/swagger-ui/index.html

🔐 Authentication is required. Use the credentials you just created.

---

## 📘 Main Endpoints

| Method | Endpoint             | Description                  |
|--------|----------------------|------------------------------|
| GET    | /api/books           | Get all books (paginated)    |
| GET    | /api/books/{id}      | Get a book by ID             |
| POST   | /api/books           | Create a new book            |
| PUT    | /api/books/{id}      | Update an existing book      |
| DELETE | /api/books/{id}      | Delete a book                |

---

### Example: Create a Book

```
curl -X POST http://localhost:8080/api/books \  
-H "Content-Type: application/json" \  
-d '{"title": "Clean Code", "author": "Robert C. Martin", "publishedYear": 2008}'
```

---

## ⚠️ Error Handling

The API will return proper status codes and messages:

- 404 Not Found – Book not found  
- 400 Bad Request – Validation failed  
- 401 Unauthorized – Authentication required  

---

## 📁 Project Structure

```
src/
├── main
│   ├── java
│   │   └── com
│   │       └── aurigabriel
│   │           └── books
│   │               ├── BooksApplication.java
│   │               ├── config
│   │               │   └── SecurityConfig.java
│   │               ├── controller
│   │               │   ├── AuthenticationController.java
│   │               │   ├── BookController.java
│   │               │   └── UserController.java
│   │               ├── dto
│   │               │   ├── BookDTO.java
│   │               │   ├── UserCreateRequestDTO.java
│   │               │   └── UserDTO.java
│   │               ├── exception
│   │               │   ├── GlobalExceptionHandler.java
│   │               │   └── ResourceNotFoundException.java
│   │               ├── mapper
│   │               │   ├── BookMapper.java
│   │               │   └── UserMapper.java
│   │               ├── model
│   │               │   ├── Book.java
│   │               │   └── User.java
│   │               ├── repository
│   │               │   ├── BookRepository.java
│   │               │   └── UserRepository.java
│   │               ├── security
│   │               │   ├── AuthenticationService.java
│   │               │   ├── JwtService.java
│   │               │   ├── UserAuthenticated.java
│   │               │   └── UserDetailsServiceImpl.java
│   │               ├── service
│   │               └── utils
│   └── resources
│       ├── application.properties
│       ├── private.key
│       └── public.key
└── test
    └── java
        └── com
            └── aurigabriel
                └── books
                    └── DemoApplicationTests.java

```

