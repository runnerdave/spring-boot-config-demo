# Spring boot prac 

## Problem description
### Exercise

* Create a new web application
* Create some configuration values in both a properties/YAML configuration file.
* Create the following packages under your main package
    * controller
    * service
* Create a Home Controller (in the controller package) with as many methods as you like
* In one of those methods print out a value from one of your configuration files to the screen.
* Create a new service in the services package (don't forget to use the @Service annotation)
* Create a method in the service class that returns a string message
* Use @Autowired to inject an instance of the service class
    * play around with property / setter / constructor based injection
* Call the service method from a controller method and print out the message that was returned from the service

## Solution
The solution displays the details of a Home which are stored in a property file

### Endpoints
* [http://localhost:8889/] prints out a value from the properties file
* [http://localhost:8889/requestDummyService] wires the HomeDetails service to the Controller and calls a dummy method in it.
* [http://localhost:8889/requestElDummy] demonstrates use of _@Autowired_ on the setter
* [http://localhost:8889/requestHomeDetails] demonstrates the use of _@Autowired_ on the constructor

## Build
``gradle build``

## Run
``java -jar build/libs/spring-boot-config-demo-0.0.1-SNAPSHOT.jar``