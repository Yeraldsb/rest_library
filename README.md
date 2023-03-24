# :seedling: Spring Boot Thymeleaf Api Rest Project

This project is a simple web application built using Spring Boot, Thymeleaf, HTML, Bootstrap, and MySQL. 
It demonstrates how to create and manage relationships between tables using the one-to-many and many-to-one relationship mapping.

# Requirements & Installation
To run this application, you will need:

 - Java JDK 11 or later <br>
 - Maven <br>
 - MySQL <br>
 
 Clone this repository <br>
 Update the **src/main/resources/application.properties** file with your MySQL database credentials: <br>
 
 **spring.datasource.url=jdbc:mysql://localhost:3306/your-db** <br>
 **spring.datasource.username= your-username** <br>
 **spring.datasource.password= your-password** <br>
 
 # Usage
 The application allows you to manage two entities: Library and Book. A library can have multiple books,(complete after finishing example to 
 explain better ).
You can view all authors and their books by clicking on the "Authors" link in the navigation bar. 
You can also view a specific author and their books by clicking on the author's name. etc (complete here too)

# Conclusion :computer:
This project demonstrates how to create a web application using Spring Boot, Thymeleaf, HTML, Bootstrap, and MySQL,
and how to manage relationships between tables using the one-to-many and many-to-one relationship mapping.
Feel free to use this project as a starting point for your own web applications.
