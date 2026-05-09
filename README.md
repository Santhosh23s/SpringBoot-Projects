# Student Record Management System

A RESTful CRUD API built using Spring Boot and PostgreSQL.

## Features

- Create Student
- Get All Students
- Get Student By ID
- Update Student
- Delete Student
- Global Exception Handling
- Custom Error Responses
- PostgreSQL Integration

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok

## Project Structure

```text
controller   -> REST APIs
service      -> Business Logic
repository   -> Database Access
entity       -> JPA Entities
exception    -> Global Exception Handling
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /students | Get all students |
| GET | /students/{id} | Get student by ID |
| POST | /students | Create student |
| PUT | /students/{id} | Update student |
| DELETE | /students/{id} | Delete student |

---

## Sample JSON

```json
{
  "id": 1,
  "firstName": "Sandev",
  "lastName": "Kumar",
  "email": "sandev@gmail.com",
  "age": 21
}
```

## Database Configuration

Update your PostgreSQL credentials inside:

```text
src/main/resources/application.yaml
```

## Run Project

```bash
mvn spring-boot:run
```

## Author

Sandev
