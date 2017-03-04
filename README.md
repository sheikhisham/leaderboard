# leaderboard

Here we are trying to register this service to Eureka Registry Server, so the same can be discovered and used by other services

# Building java resource and Docker image

To build the java resource file please execute following command
`mvn clean package`

# Running application on local environment
build the application using above command, copy application.properties from src/main/resource/config to target folder and run `java -jar xxx.jar`
