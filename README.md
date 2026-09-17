# Healthcare JWT Authentication and Role-Based Authorization

A secure Spring Boot REST API for a Healthcare Management System implementing **JWT Authentication**, **Role-Based Authorization**, and **MySQL** integration using Spring Security.

## Project Overview

This project provides a secure backend where users can:

* Register a new account
* Login using JWT Authentication
* Access APIs based on USER and ADMIN roles
* Perform protected operations securely

## Tech Stack

| Technology      | Version        |
| --------------- | -------------- |
| Java            | 17             |
| Spring Boot     | 3.x            |
| Spring Security | Latest         |
| JWT             | JSON Web Token |
| Spring Data JPA | Hibernate      |
| MySQL           | 8.x            |
| Maven           | Build Tool     |
| Postman         | API Testing    |

## Project Structure

```text id="8dd6o8"
healthcare-jwt-auth
│
├── src
│   └── main
│       ├── java
│       │   └── com.healthcare.jwtauth
│       │       ├── config
│       │       ├── controller
│       │       ├── dto
│       │       ├── entity
│       │       ├── repository
│       │       ├── security
│       │       ├── service
│       │       └── HealthcareJwtAuthApplication.java
│       └── resources
│           └── application.properties
├── pom.xml
└── README.md
```

## Features

* JWT Authentication
* Role-Based Authorization (USER & ADMIN)
* BCrypt Password Encryption
* User Registration and Login
* Protected REST APIs
* MySQL Database Integration
* Postman Testing

## Database Configuration

Create the database:

```sql id="fxa7w0"
CREATE DATABASE healthcare_db;
USE healthcare_db;
```

Configure `application.properties`:

```properties id="o2p8j0"
spring.datasource.url=jdbc:mysql://localhost:3306/healthcare_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8081
```

## Running the Project

1. Clone the repository.
2. Open the project in Spring Tool Suite (STS).
3. Create the `healthcare_db` database.
4. Update the database credentials.
5. Run `HealthcareJwtAuthApplication`.
6. Access the APIs using `http://localhost:8081`.

## Authentication APIs

| Method | Endpoint         | Description            |
| ------ | ---------------- | ---------------------- |
| POST   | `/auth/register` | Register a new user    |
| POST   | `/auth/login`    | Login and generate JWT |

## Task APIs

| Method | Endpoint               | Access      |
| ------ | ---------------------- | ----------- |
| POST   | `/tasks`               | USER, ADMIN |
| GET    | `/tasks`               | USER, ADMIN |
| GET    | `/tasks/{id}`          | USER, ADMIN |
| PUT    | `/tasks/{id}`          | ADMIN       |
| DELETE | `/tasks/{id}`          | ADMIN       |
| GET    | `/tasks/search?title=` | USER, ADMIN |

## Security Flow

1. Register a user.
2. Login using username and password.
3. Receive a JWT token.
4. Add the token to the request header.

```text id="m4jlb4"
Authorization: Bearer <JWT_TOKEN>
```

5. Access protected APIs based on the assigned role.

## Sample Login Request

**POST** `http://localhost:8081/auth/login`

```json id="0nqb2w"
{
  "username": "vamsi",
  "password": "Password@123"
}
```

### Sample Response

```json id="4lmvii"
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```

## Testing

Successfully tested using **Postman**:

* User Registration
* User Login
* JWT Token Generation
* Role-Based Authorization
* Protected API Access

## Author

**Vamsi Valluru**

Java Full Stack Developer
