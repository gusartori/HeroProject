# RESTful service using JAX-RS

## Overview

The application here presented is a simple RESTFul service that performs operations on top of a relational memory database.
The relational database represent two entities, Hero and ABility .
For this I built a Maven project using Spring Boot framework configured with JAX RS (using Jersey). The application is deployed in an embedded Tomcat and access a H2 in memory database through Spring Data.
The application was designed using Clean Architecture.

## Running the application

Make sure you do not have any server running on port 8080, that is where Tomcat will make available our application. To run, go to root folder and type on your terminal:

> mvn spring-boot:run

## Considerations

Every time the application starts, a service (HeroImporter) is called to bring new heroes and abilities from Overwatch server. Those information are loaded into the H2 in memory database.
All the REST endpoints are GET Mapped and you can test them in any client (browser) you want:

http://localhost:8080/api/abilities/
http://localhost:8080/api/abilities/1
http://localhost:8080/api/heros/
http://localhost:8080/api/heros/1/
http://localhost:8080/api/heros/1/abilities