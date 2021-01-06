# Allianz-Homework

Create a data model in order to store and provide the sensor readings. Design a REST API for creating and querying the CO2 data.

**Built With**

- JDK 15
- Maven 'apache-maven-3.6.3'

**Application Run by Terminal**

Go to the 'allianzhw' directory and run the following commands:

- mvn clean install
- java -jar target/allianzhw-0.0.1-SNAPSHOT.jar

After a lot of startup messages, finally know the application is running when it print started. So I know that by default, Spring Boot microservices use port 8080.
Let's see if the application is accepting requests via the browser. So I'm at a browser and I'm going to hit the application at local host 8080 to see if it's listening. 
And it prints a json message.

**REST APIs End Point**

Following is the endpoint for retrieval of the whole model 
- http://localhost:8080/cityModels
- http://localhost:8080/cityModels/search/findByCity?city=Wien
- http://localhost:8080/districtModels/
- Create a new entry into the in memory database (H2).
  - {
      "city":"XYZ",
      "district":"ABCD"
    }
- Delete entry point.

At the end there are few Unit Test has been created.
