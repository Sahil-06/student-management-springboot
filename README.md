# 🎓 Student Management System – Spring Boot

A backend **Student Management System** built using **Spring Boot**, following clean architecture and industry best practices.  
This project provides **RESTful APIs** for managing students with validation, exception handling, database integration, and **JWT-based security (currently in progress)**.

---

## 🚀 Features

- CRUD operations for Student
- RESTful APIs
- Clean Layered Architecture  
  (Controller → Service → Repository)
- Bean Validation
- Global Exception Handling
- Database integration (H2 / MySQL)
- Spring Security integration
- JWT-based authentication (**Work in Progress**)
- Maven-based project

---

## 🔐 Security Status (Important)

> 🚧 **Security Implementation – In Progress**

- Spring Security is configured
- Login endpoint is implemented
- JWT token generation is implemented
- Token validation & authorization filter is **currently under development**
- APIs are being secured incrementally

This project is actively evolving to include **complete JWT-based authentication and authorization** following industry best practices.

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- Spring Web
- Spring Data JPA
- Spring Security
- JWT (JSON Web Token)
- MySQL / H2 Database
- Maven
- Postman (API Testing)

---

## 🧱 Project Architecture

Controller → Service → Repository → Database


### Responsibilities
- **Controller**: Handles HTTP requests & responses
- **Service**: Business logic
- **Repository**: Database operations
- **Entity**: Database models

---

## 📂 Project Structure



src/main/java/com/example/demo
│
├── controller
│ ├── StudentController.java
│ └── AuthController.java
│
├── service
│ └── StudentService.java
│
├── repository
│ ├── StudentRepository.java
│ └── UserRepository.java
│
├── entity
│ ├── Student.java
│ └── User.java
│
├── security
│ ├── JwtUtil.java
│ ├── SecurityConfig.java
│ └── CustomUserDetailsService.java
│
├── exception
│ └── GlobalExceptionHandler.java
│
└── DemoApplication.java


---

## 🌐 API Endpoints

### 🔑 Authentication
| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/login` | Login & generate JWT token |

### 🎓 Student APIs (Secured)
| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/api/students` | Create student |
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get student by ID |
| PUT | `/api/students/{id}` | Update student |
| DELETE | `/api/students/{id}` | Delete student |

---

## 🧪 Sample Request – Create Student

```json
{
  "name": "Sahil",
  "email": "sahil@gmail.com",
  "age": 24,
  "course": "Spring Boot"
}

⚙️ Database Configuration
🐬 MySQL (application.properties)
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

🧪 H2 Database (For Testing)
spring.datasource.url=jdbc:h2:mem:studentdb
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

▶️ How to Run the Project
1️⃣ Clone Repository
git clone https://github.com/Sahil-06/student-management-springboot.git

2️⃣ Navigate to Project
cd student-management-springboot

3️⃣ Run Application
mvn spring-boot:run


OR
Run DemoApplication.java from your IDE.

🧪 API Testing

Use Postman

Login first using /login

Copy JWT token

Pass token in headers for secured APIs

Authorization: Bearer <JWT_TOKEN>

🧠 Learning Outcomes

Spring Boot REST API development

Dependency Injection

JPA & Hibernate

Validation & Exception Handling

JWT-based authentication (in progress)

Clean backend architecture

Real-world project structure

📌 Future Enhancements

Complete JWT validation filter

Role-based authorization (ADMIN / USER)

Refresh token implementation

Swagger / OpenAPI documentation

Pagination & Sorting

Frontend integration (React)

👨‍💻 Author

Md Sahil
Backend Developer – Java & Spring Boot

