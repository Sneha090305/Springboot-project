# Hello Messaging – Spring Boot REST Application

## Overview

This project is a simple **Spring Boot REST API application** that demonstrates how to create and run a basic REST endpoint. The application returns greeting messages when requests are sent to the server.

This project is created using **Spring Boot**, **Maven**, and **Java 17**.

---

## Technologies Used

* Java 17
* Spring Boot
* Maven
* Spring Web
* IntelliJ IDEA

---

## Project Structure

dependency-injection-demo
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com.bridgelabz.dependency_injection_demo
│ │ │ ├── DependencyInjectionDemoApplication.java
│ │ │ └── HelloController.java
│ │ └── resources
│ │ └── application.properties
│ └── test
├── pom.xml
└── README.md


---

## Main Application Class

`DependencyInjectionDemoApplication.java`

This is the **entry point** of the Spring Boot application.

```java
@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionDemoApplication.class, args);
    }

}

REST Controller

HelloController.java

This controller handles HTTP requests and returns a greeting message.

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

}

Running the Application

Open the project in IntelliJ IDEA.

Run the main class:

DependencyInjectionDemoApplication.java

The application will start on port 8080.

Testing the API

Open your browser and enter:

http://localhost:8080/hello

Output:

Hello from BridgeLabz
Learning Objectives

This project demonstrates:

Creating a Spring Boot project

Understanding project structure

Creating a REST Controller

Handling HTTP requests

Running a Spring Boot application

Author

Sneha