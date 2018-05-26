# springboot-Jobs-Portal

Jobs portal is a web based blog which allows registered users to users to post content such as jobs and other usefull information.

## What's inside 
This project is based on the [Spring Boot](http://projects.spring.io/spring-boot/) project and uses these packages :
- Maven
- Spring Core
- Spring Data (Hibernate & MySQL/Postgres/MongoDB)
- Spring MVC 


## Installation 
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

## Database configuration 
Create a MySQL database with the name `jobs_portal`and add the credentials to `/resources/application.properties`.  
The default ones are :

```
spring.datasource.url=jdbc:mysql://localhost:3306/jobs_portal
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

## Usage 
Run the project and head out to [http://localhost:8080](http://localhost:8080)
