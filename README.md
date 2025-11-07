Student Database Management System - Backend API

A complete RESTful backend service for managing student information. This Spring Boot application provides a robust API for performing all CRUD (Create, Read, Update, Delete) operations on student records with proper data validation, exception handling, and database persistence.
**Features**
    RESTful API Design: Clean, structured endpoints following REST conventions

    Full CRUD Operations: Create, retrieve, update, and delete student records

    Data Validation: Comprehensive input validation using Bean Validation API

    Exception Handling: Global exception handling with meaningful HTTP status codes

    Database Integration: Oracle persistence with Spring Data JPA

    CORS Configuration: Ready for frontend integration

    Maven Build: Standard project structure and dependency management
**Tech Stack**
    Framework: Spring Boot 3.x

    Language: Java 17+

    Persistence: Spring Data JPA (Hibernate)

    Database: Oracle

    Build Tool: Maven

    Validation: Bean Validation API (Hibernate Validator)

    Testing: JUnit, Mockito, Spring Boot Test

**Prerequisites**
    JDK 17 or later

    Maven 3.6+

    Oracle Server 

    IDE (Spring Tool Suite, IntelliJ IDEA, or VS Code)

    API Testing Tool (Postman, cURL, or Insomnia)

**Database Configuration**
    Start your MySQL server

    Create a database schema:
    sql

CREATE DATABASE student_database;

Update src/main/resources/application.properties:
properties

# Optional: Format SQL queries in logs
spring.jpa.properties.hibernate.format_sql=true

**Installation & Run**

    Clone the repository:
    bash

git clone https://github.com/Maanya-mv/StudentDatabase-Springboot.git
cd StudentDatabase-Springboot

Build the project:
bash

mvn clean install

Run the application:
bash

mvn spring-boot:run

    The API will start on http://localhost:8080

**API Endpoints**
Method	Endpoint	Description	Request Body
GET	/api/students	Get all students	-
GET	/api/students/{id}	Get student by ID	-
POST	/api/students	Create a new student	Student JSON
PUT	/api/students/{id}	Update student by ID	Student JSON
DELETE	/api/students/{id}	Delete student by ID	-
Student Model
json

{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "phone": "123-456-7890",
  "course": "Computer Science",
  "year": 2024
}

🔧 API Usage Examples
1. Get All Students
bash

curl -X GET http://localhost:8080/api/students

2. Get Student by ID
bash

curl -X GET http://localhost:8080/api/students/1

3. Create a New Student
bash

curl -X POST http://localhost:8080/api/students \
  -H "Content-Type: application/json" \
  -d '{
    "firstName": "Jane",
    "lastName": "Smith",
    "email": "jane.smith@example.com",
    "phone": "987-654-3210",
    "course": "Mathematics",
    "year": 2025
  }'

4. Update Student
bash

curl -X PUT http://localhost:8080/api/students/1 \
  -H "Content-Type: application/json" \
  -d '{
    "firstName": "John",
    "lastName": "Doe Updated",
    "email": "john.updated@example.com",
    "phone": "111-222-3333",
    "course": "Physics",
    "year": 2024
  }'

5. Delete Student
bash

curl -X DELETE http://localhost:8080/api/students/1

**Project Structure**
text

src/main/java/com/example/studentdatabase/
├── StudentDatabaseApplication.java     # Main application class
├── controller/
│   └── StudentController.java          # REST controller with API endpoints
├── model/
│   └── Student.java                    # Entity class with JPA annotations
├── repository/
│   └── StudentRepository.java          # Spring Data JPA repository
├── service/
│   ├── StudentService.java             # Service interface
│   └── impl/
│       └── StudentServiceImpl.java     # Service implementation
└── exception/
    ├── ResourceNotFoundException.java  # Custom exception
    └── GlobalExceptionHandler.java     # Global exception handler

🧪 Testing the API

Use Postman or any API client to test the endpoints:

    Import the collection into Postman

    Set base URL to http://localhost:8080

    Test all CRUD operations with the provided endpoints

Sample Test Scenarios:

    Create a new student (POST)

    Retrieve all students (GET)

    Get specific student by ID (GET)

    Update student information (PUT)

    Delete a student (DELETE)

⚙️ Configuration Details
Application Properties
properties

# Server Configuration
server.port=8080

# Database Configuration
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA Configuration
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

# CORS Configuration (for frontend integration)
# spring.web.cors.allowed-origins=http://localhost:3000

**Contributing**
Contributions are welcome! Please feel free to submit a Pull Request.

    Fork the project

    Create your feature branch (git checkout -b feature/AmazingFeature)

    Commit your changes (git commit -m 'Add some AmazingFeature')

    Push to the branch (git push origin feature/AmazingFeature)

    Open a Pull Request

**License**

This project is licensed under the MIT License - see the LICENSE file for details.
**Author**
Maanya M V

    GitHub: @Maanya-mv

**Future Enhancements**
    Add Spring Security for authentication and authorization

    Implement pagination and sorting for GET endpoints

    Add comprehensive unit and integration tests

    Implement caching with Redis

    Add API documentation with Swagger/OpenAPI

    Dockerize the application

    Add logging with SLF4J

    Implement email service for notifications


