# Java Servlets 

A simple dynamic web application built with **Jakarta Servlet API**.  
This project demonstrates the basics of how to handle HTTP requests and responses using servlets.  

***

## What You Will Learn  

- What is a Servlet  
  A Servlet is a Java program that runs on a server to generate dynamic web content.  

- Servlet Lifecycle  
  - init() → Runs once when the servlet is first loaded  
  - service() → Handles every request  
  - destroy() → Cleans resources before the servlet is unloaded  

- HTTP Methods  
  - doGet() → Handles GET requests with query parameters  
  - doPost() → Handles POST requests like form submissions  

- Deployment Descriptor (web.xml)  
  - Registers servlets  
  - Maps URL patterns to servlet classes  

- Request and Response Handling  
  - HttpServletRequest → Reads parameters, headers, and form data  
  - HttpServletResponse → Sends responses such as HTML or plain text  

***
## Project Structure  

```
FirstDynamicWebA/
├── src/
│   └── com/
│       └── FirstHibernateProject.java     (Servlet class)
├── WebContent/
│   ├── WEB-INF/
│   │   └── web.xml                       (Deployment descriptor)
│   └── index.html                        (Frontend)
├── .classpath
├── .project
└── README.md
```

***

## web.xml Configuration  

```xml
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="https://jakarta.ee/xml/ns/jakartaee"
         xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee https://jakarta.ee/xml/ns/jakartaee/web-app_6_0.xsd"
         version="6.0">

    <display-name>FirstDynamicWebA</display-name>

    <servlet>
        <servlet-name>hello</servlet-name>
        <servlet-class>com.FirstHibernateProject</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>

</web-app>
```

***

## How It Works  

1. The servlet is registered in web.xml with the name "hello".  
2. It is linked to the Java class `com.FirstHibernateProject`.  
3. The URL pattern `/hello` is mapped to the servlet.  
4. When you open `http://localhost:8080/FirstDynamicWebA/hello` in your browser, the servlet executes and sends back a response.  

***

## Technologies Used  

- Java 17 or above  
- Jakarta Servlet API 6.0  
- Apache Tomcat 10 or above  
- Eclipse IDE  

***

## How to Run  

1. Import the project into Eclipse as a Dynamic Web Project.  
2. Configure Apache Tomcat 10 or above in Eclipse.  
3. Right-click on the project and select "Run on Server".  
4. Open the URL:  
   ```
   http://localhost:8080/FirstDynamicWebA/hello
   ```

***
