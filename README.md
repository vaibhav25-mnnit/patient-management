# Patient Management Backend 🌐

This a backend service for a patient management system built using **Spring Boot** with a **microservices architecture**.  
This project splits core services like patient records, billing, analytics, and API routing into independent Spring Boot services to enable modular, scalable backend infrastructure.

---

## 🧠 Overview

This repository contains the backend implementation of a Patient Management System using a **microservices architecture** — each service focuses on a specific domain like patients, billing, analytics, and gateway routing. This pattern enables:

- Independent development & deployment of services
- Clear separation of business logic
- Scalability & maintainability

---

## 📁 Project Structure

| Folder / Service           | Description |
|---------------------------|-------------|
| **api-gateway**           | Entry point to route requests to appropriate microservices |
| **patient-service**       | Manages patient-related operations (CRUD, profiles, records) |
| **billing-service**       | Handles billing, invoicing, and payment processing |
| **analytics-service**     | Generates analytics and reporting based on events |
| **infrastructure**        | Deployment, configs, or orchestration resources |
| **.gitmodules**           | Git modules configuration (if used) |
| **.gitignore**            | Ignored files for Git |
| **README.md**             | This documentation |

---
## 🧰 Tech Stack Used

This project demonstrates hands-on experience with modern backend development, distributed systems, and DevOps practices.  
It serves as proof of practical implementation of scalable microservices architecture.

---

### 🔹 Core Backend
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate (ORM)
- RESTful API Development

---

### 🔹 Microservices & Cloud
- Spring Cloud
- Spring Cloud Gateway (API Gateway Pattern)
- OpenFeign Client (Service-to-Service Communication)
- Eureka Service Discovery
- Centralized Configuration (Config Server)
- Distributed System Design

---

### 🔹 Messaging & Event-Driven Architecture
- Apache Kafka
- Kafka Producers & Consumers
- Event-Driven Architecture
- Asynchronous Communication Between Services

---

### 🔹 Database & Persistence
- MySQL
- PostgreSQL
- H2 (In-memory testing database)
- JPA Repository Pattern
- Transaction Management

---

### 🔹 Security
- Spring Security
- JWT Authentication
- Role-Based Access Control (RBAC)
- API Token Validation
- Secure REST APIs

---

### 🔹 API Documentation & Testing
- OpenAPI / Swagger
- Postman
- JSON-based API Design

---

### 🔹 DevOps & Deployment
- Docker
- Docker Compose
- Containerized Microservices
- Environment-Based Configuration
- Linux Deployment Basics

---

### 🔹 Version Control & Collaboration
- Git
- GitHub
- Git Submodules

---

### 🔹 Architecture & Design Patterns
- Microservices Architecture
- MVC Pattern
- Repository Pattern
- DTO Pattern
- Builder Pattern
- Dependency Injection
- Circuit Breaker Pattern (Resilience4j)
- Clean Code Principles

---

### 🚀 Optional / Advanced Enhancements
*(Add if implemented or planned)*

- Redis (Caching Layer)
- Resilience4j (Fault Tolerance)
- Distributed Tracing (Sleuth + Zipkin)
- ELK Stack (Centralized Logging)
- Kubernetes (Container Orchestration)
- CI/CD Pipelines (GitHub Actions / Jenkins)

---
---

## 🚀 Features

- 🚪 API Gateway to centralize request routing
- 🧑‍⚕️ Patient Service for managing patient records
- 💳 Billing Service to record financial transactions
- 📈 Analytics Service for usage metrics & reporting
- 📦 Decoupled services for modular backend development
- 📡 Independent scaling for high performance

---

## License

This project is licensed under the MIT License.

Made with ❤️ by [@vaibhav25-mnnit](https://github.com/vaibhav25-mnnit)

---
