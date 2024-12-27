# Book Management and Image Service Microservices

## Overview
This repository contains two microservices designed to handle book data management and image storage. Each service operates independently but can be integrated for a complete book management system.

---

## Microservices Details

### 1. Book Management Service
**Purpose:**
- Manage book-related data such as title, author, and metadata.
- Store data in a relational database.

**Tech Stack:**
- **Java** - Core programming language.
- **Spring Boot** - Framework for building microservices.
- **AWS RDS** - Relational database for persistent data storage.
- **Spring JPA** - ORM framework for database interactions.

**Features:**
- Create, Read, Update, and Delete (CRUD) book information.
- RESTful API endpoints for book data management.
- Database integration using AWS RDS.

**Setup Instructions:**
1. Configure AWS RDS instance and update connection details in `application.properties`.
2. Build and run the application:
   ```bash
   mvn clean install
   java -jar target/book-management-service.jar
   ```
3. Access the API at `http://localhost:8080/api/books`.

---

### 2. Image Service
**Purpose:**
- Handle uploading and retrieving book-related images.
- Utilize AWS S3 for scalable and secure storage.

**Tech Stack:**
- **Java** - Core programming language.
- **Spring Boot** - Framework for building microservices.
- **AWS S3** - Cloud storage service.

**Features:**
- Upload images to AWS S3.
- Retrieve and serve images from AWS S3.
- RESTful API endpoints for image handling.

**Setup Instructions:**
1. Configure AWS credentials and S3 bucket details in `application.properties`.
2. Build and run the application:
   ```bash
   mvn clean install
   java -jar target/image-service.jar
   ```
3. Access the API at `http://localhost:8081/api/images`.

---

## Prerequisites
- **Java 11 or higher** installed.
- **Maven** for dependency management and builds.
- AWS account with permissions for RDS and S3.

---

## Deployment
- Use Docker or Kubernetes for containerized deployment.
- Configure environment variables for AWS credentials and database connection settings.

---

## Contributing
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request with detailed changes.



## Contact
For queries or support, reach out via venkatreddyattala12345@gmail.com

