### Delta Customer Feedback API
This repository contains the source code for the Customer Feedback API

## Requirements
- Java 8+ (runtime environment)
- Mongo DB (to manage the data)
- Maven 3+ (to build the application)

## Build
Run ```mvn clean install``` on the parent directory of this repository

## Build artefact
The build produces an executable jar file under the target folder!

## Run
Update the following properties as per your runtime environment:

- application.properties

Run the application using the java -jar command along with the aforementioned properties.
On successful startup, the API will listen on port `8080`.

Example:

``` java -jar target/customer_feedback_api-0.0.1-SNAPSHOT.jar

## Stop

- ```Ctrl+C``` on the terminal will gracefully shut down the application

## Swagger API Docs
On successful startup go to `http://localhost:8080/swagger-ui.html` to view the API docs and try it out yourself.

## Note: You can create new products using Swagger UI.