# Basic Netlflix Eureka Spring Boot Microservice project 

## Rationale for development

I wanted to learn more about netflix eureka and try to create a simple two service microservice which spoke with each other, I wanted to dockerize them so that could speak with each other without the need of fixed ip addresses

## What is it?

This is a simple "Book store" app, it stores a list of books and their authors.

## Docker-Compose

Hopefully its pretty straight forward theres 1 mysql db, 1 eureka service registry and a couple of microservices 1 author and 1 book

## REST API's
Both the book and author services expose a REST API on port 8080 and 8081 respectively, these have GET and POST functionality, I should create a swagger api for both so that the structure of these object is known, though the sql creation script does provide the table schema

## Things to improve
- [ ] Swaggerize the REST API for easier documentation
- [ ] Standardising the errors returned from the API, for easier consuming
- [ ] Logging to a file within the project, for easier debugging
- [ ] Adding security features
- [ ] More testing
- [ ] Probably a lot of cleanup and refactoring 
