# Supplier Management System

The Supplier Management System is a Spring Boot application designed to manage supplier details, including their location, nature of business, and manufacturing processes. It provides APIs to create new suppliers and query suppliers based on specific criteria.

Features
Create Supplier: Add new suppliers to the system with details such as company name, website, location, nature of business, and manufacturing processes.
Query Suppliers: Retrieve a list of suppliers based on location, nature of business, and specific manufacturing processes.

Technologies Used
Spring Boot
PostgreSQL
JPA/Hibernate

Getting Started

Update application.properties:
Configure your PostgreSQL database connection in the src/main/resources/application.properties file.

Run the application:
mvn spring-boot:run

API Endpoints:

POST /api/supplier/create: Create a new supplier.
POST /api/supplier/query: Query suppliers based on location, nature of business, and manufacturing process.

More Details
For a detailed overview of the project, including the API specifications and usage examples, please refer to the project documentation.
