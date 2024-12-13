# Student API Project

This is a Spring Boot backend application that manages students and their enrolled subjects. It includes basic CRUD operations, role-based authentication with JWT, and uses an in-memory H2 database.

## Features

### # Entities
- **Student**: Includes fields for `name` and `address`.
- **Subject**: Includes a field for `name`.
- **Relationship**: A Student can enroll in multiple Subjects.

### # REST APIs
#### ## POST APIs:
1. **Create a Student**
2. **Create a Subject**

#### ## GET APIs:
1. **Get the list of all Students**
2. **Get the list of all Subjects**

### # Security
- JWT-based authentication and login.
- Two roles are defined:
  - **Student**
  - **Admin**

### # Database
- Uses an in-memory H2 database for simplicity and easy testing.

## Environment Requirements
- **JDK Version**: 19 or higher
- **Build Tool**: Maven

## Setup Instructions

### # Prerequisites
1. Install **JDK 19** or higher.
2. Install **Maven**.

### # Steps to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/ghulevidya/student_api.git
   ```

2. Navigate to the project directory:
   ```bash
   cd student_api
   ```

3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the application:
   - Swagger documentation (if enabled): `http://localhost:8080/swagger-ui.html`
   - H2 Database Console: `http://localhost:8080/h2-console`

### # Configurations
- **JWT Configuration**:
  - Default login endpoint: `/auth/login`
  - Provide credentials (`username` and `password`) to receive a JWT token.
  - Use the token for authorization in subsequent requests by including it in the `Authorization` header as `Bearer <token>`.

- **H2 Database**:
  - URL: `jdbc:h2:mem:testdb`
  - Username: `sa`
  - Password: (leave blank)

### # API Endpoints
#### ## Authentication
- **POST /auth/login**: Generate JWT token.

#### ## Student APIs
- **POST /students**: Create a new student.
- **GET /students**: Retrieve all students.

#### ## Subject APIs
- **POST /subjects**: Create a new subject.
- **GET /subjects**: Retrieve all subjects.

### # Example JSON Requests
#### ## Student
**POST /students**
```json
{
  "name": "John Doe",
  "address": "123 Main Street, Springfield"
}
```

#### ## Subject
**POST /subjects**
```json
{
  "name": "Mathematics"
}
```

### # Example JSON Response
#### ## GET /students
```json
[
  {
    "id": 1,
    "name": "John Doe",
    "address": "123 Main Street, Springfield",
    "enrolledSubjects": [
      {
        "id": 1,
        "name": "Mathematics"
      },
      {
        "id": 2,
        "name": "Science"
      }
    ]
  }
]
```

#### ## GET /subjects
```json
[
  {
    "id": 1,
    "name": "Mathematics"
  },
  {
    "id": 2,
    "name": "Science"
  }
]
```

## Deployment
- The project is version controlled using Git.
- Repository URL: [https://github.com/ghulevidya/student_api.git](https://github.com/ghulevidya/student_api.git)

## Tools and Technologies Used
- **Spring Boot**: Backend framework
- **JWT**: Security
- **H2 Database**: In-memory database for testing
- **Maven**: Build tool

## License
This project is licensed under the MIT License. For more details, refer to the LICENSE file in the repository.

---

Happy Coding! 🎉




