# Inter-Service Communication using Spring Boot Microservices

A demonstration project showcasing different approaches to communication between Spring Boot microservices. This project helps understand how independent services exchange data while maintaining loose coupling in a microservices architecture.

## 🚀 Features

- REST-based synchronous communication
- Service-to-service communication
- Spring Boot 4.x
- Spring Web
- Spring Cloud OpenFeign
- RestClient (Spring Boot replacement for RestTemplate)
- WebClient (Reactive HTTP client)
- RestTemplate (legacy synchronous client)
- HttpInterface (Spring Boot 3 declarative HTTP client)

---

## 🛠️ Tech Stack 
Java 17
Spring Boot 4.1.x
Spring Cloud 
Springdoc OpenAPI
Feign Client
WebClient (Reactor Netty)
RestClient
---
## ⚙️ Getting Started

### Clone the Repository

```bash
git clone https://github.com/piyushsj02/InterService_Communication.git
```

### Navigate to the Project

```bash
cd InterService_Communication

```
```bash
cd producer
mvn spring-boot:run

```
Runs on port 8081
```
```bash
cd consumer
mvn spring-boot:run

```
Runs on port 8080


## Demonstrates calling Producer APIs via:

Feign Client → /api/feign/instance
RestClient → /api/rest-client/instance
WebClient → /api/web-client/instance
RestTemplate → /api/rest-template/instance
HttpInterface → /api/http-interface/instance
