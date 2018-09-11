# HibernateVsJdbc
This repository stores code example presenting the difference between executing the same code with JDBC framework and Hibernate. 
Both examples connect to localhost MySql database called hibernatePlayground with credentials specified either in persistence.xml or the JDBC connection string. 
Both examples also assume there exists a Car table in the database with an entry of Id=1. 

## Running the application
Entries for each of the examples are in the respective test classes. For example for hibernate, the test is present [here](https://github.com/adam-stankowski/HibernateVsJdbc/blob/master/Hibernate/src/test/java/as/hibernate/dao/CarDaoImplTest.java)

You can also run the application with gradle by running 
```./gradlew build```
provided you're using gradle wrapper config for your project

