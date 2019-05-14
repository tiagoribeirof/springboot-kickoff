# viplist
Java project using SpringBoot and Maven.

This project is for demonstrate the use of some libraries with SpringBoot.

Following up the dependencies.

##### Library to start the SpringBoot Project
- spring-boot-starter-web

##### Library to use WildFly/Jboss instead Tomcat 
- javax.servlet-api

##### Library to help us to obtain some metrics about the system health
- spring-boot-starter-actuator

##### Library to use ElasticSearch in project (if we need it)
- spring-boot-starter-data-elasticsearch 

##### Library to help with development, in charge of automatic update of changes in the server
- spring-boot-devtools

##### Library to use Jpa on the database layer
- spring-boot-starter-data-jpa

##### Library to facilitate log tracking (creates a unique id)
- spring-cloud-starter-sleuth
  
##### Library to cache data
- spring-boot-starter-data-redis

##### Library to build a non-blocking API
- spring-boot-starter-webflux

##### Library to build POJOS more simples
- lombok  

##### Libraries to create automaticly the API documentation
- springfox-swagger2 
- springfox-swagger-ui

  



 To configure the datasource go to the application.properties and change username and password.

### The helpful Uris
 
   To see the Swagguer output - ([Swagguer](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api))
  e.g: http://{host}:{port}/{context}/v2/api-docs
 
   To see the Swagguer output in UI screen - ([Swagguer](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api))
 e.g:  http://{host}:{port}/{context}/swagger-ui.html#
   
   To see metrics from Api -  ([Actuators](https://www.baeldung.com/spring-boot-actuators))
e.g: http://{host-defined-to-status}:{port-defined-to-status}/{context-defined-to-status}/health
 
 
