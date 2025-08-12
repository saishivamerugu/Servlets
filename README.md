# Servlets
 beginner-friendly Java Servlet project that demonstrates how to handle HTTP requests and responses using the **Jakarta Servlet API**.

---

## 🚀 What I Learned

- **What is a Servlet?**  
  - Java program running on a server to create dynamic web content.

- **Servlet Lifecycle**  
  - `init()` → Initializes the servlet (runs once).  
  - `service()` → Handles requests (GET, POST, etc.).  
  - `destroy()` → Cleans up before shutting down.

- **HTTP Methods**  
  - `doGet()` → Handles GET requests (URL parameters).  
  - `doPost()` → Handles POST requests (form data).

- **Deployment Descriptor (`web.xml`)**  
  - Registers servlets and maps URLs to servlet classes.

- **Request & Response Handling**  
  - **HttpServletRequest** → Retrieve form data, parameters, headers.  
  - **HttpServletResponse** → Send HTML/text responses to clients.

---

## 📂 Project Structure
`
FirstDynamicWebA/
├── src/
│ └── com/
│ └── FirstHibernateProject.java
├── WebContent/
│ ├── WEB-INF/
│ │ └── web.xml
│ └── index.html
├── .classpath
├── .project
└── README.md

`

---

## ⚙️ `web.xml` Configuration
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="https://jakarta.ee/xml/ns/jakartaee"
         xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee https://jakarta.ee/xml/ns/jakartaee/web-app_6_0.xsd"
         id="WebApp_ID"
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
🖥 How It Works
The servlet is registered in web.xml with a unique name (hello) and linked to the Java class (com.FirstHibernateProject).

A URL pattern (/hello) is mapped to the servlet.

When the browser requests /hello, the servlet executes and returns the HTTP response.

🔧 Technologies Used
Java 17+

Jakarta Servlet API (6.0)

Apache Tomcat 10+

Eclipse IDE

📌 How to Run
Import into Eclipse as a Dynamic Web Project.

Add Tomcat 10+ to the server configuration.

Run on server
http://localhost:8080/FirstDynamicWebA/hello
