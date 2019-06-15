# java-springboot-logging

Throwling custom exceptions and logging internal server errors with Spring Boot

An exception is thrown whether you try to use same email for more then one user

I created a super class to encapsulate business exceptions, you should thing about this

## Running project

Install [Docker](https://www.docker.com/products/docker-desktop), [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads), [Spring Tool Suite](https://spring.io/tools) and [Git](https://git-scm.com/)

Clone project `git clone https://github.com/matheus-pereira/java-springboot-logging.git`

Download MongoDB image `docker pull mongo`

Start MongoDB container `docker run -d -p 27017:27017 --name mongo mongo`

Import project into Spring Tool Suite and `Run As Spring Boot App`

You can check the documentation at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
