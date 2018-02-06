# RESTful service using JAX-RS

## Overview

The application here presented is a simple RESTFul service that performs operations on top of a relational memory database.
The relational database represent two entities, Hero and ABility .
For this I built a Maven project using Spring Boot framework configured with JAX RS (using Jersey). The application is deployed in an embedded Tomcat and access a H2 in memory database through Spring Data.
The application was designed using Clean Architecture.

## Running the application

Make sure you do not have any server running on port 8080, that is where Tomcat will make available our application. To run, go to root folder and type on your terminal:

> mvn spring-boot:run

## Problems with the implementation

I did all the structure for the API, as you can see. Unfortunately I did not had time to set the memory database (H2) that I was willing to do.
I was planning to build a service (on Gateway package) to search for new Heroes and Abilities on the external API using Feign client.