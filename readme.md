# Data capture backend app


To run the Spring Boot application with the given instructions, follow these steps:

Step 1: Set Up the Database

1. Install MySQL if you haven't already.
2. Start MySQL server.

```bash
mysql -u root -p
```

3. Create the database `health_records_db`:

```sql
CREATE DATABASE health_records_db;
```

Step 2: Clone and Configure the Spring Boot Project

1. Clone your Spring Boot project repository.

```bash
git clone <repository_url>
```

2. Navigate to the project directory.

```bash
cd <project_directory>
```

3. Open the `application.properties` or `application.yml` file in your Spring Boot project and configure the database connection:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/health_records_db
spring.datasource.username=<your_mysql_username>
spring.datasource.password=<your_mysql_password>
```

Replace `<your_mysql_username>` and `<your_mysql_password>` with your actual MySQL credentials.

Step 3: Build and Run the Application

1. Open a terminal/command prompt and navigate to your project directory.

```bash
cd <project_directory>
```

2. Build the project using Maven.

```bash
mvn clean install
```

3. Run the Spring Boot application.

```bash
mvn spring-boot:run
```

The application will start, and you will see logs indicating the startup process.

Step 4: Access the Application

1. use a tool like Postman to access the endpoints.
2. To access the POST endpoint for patients, use the following URL: `http://localhost:8082/patient`.

Make sure to send appropriate POST requests to the `/patient` endpoint according to your application's requirements.

sample request

```
{
    "patientData": {
    "name" : "dd",
    "telephone": "08993424",
    "dateOfBirth": "1998-02-12",
    "idNo": "2324235",
    "address": "laikipia",
    "county": "kiambu",
    "subCounty": "limuru",
    "email": "wakahtiad@gmail.com",
    "gender": "male",
    "maritalStatus": "single"
    },
    "nextOfKinData":{
     "name" : "paul dez",
      "dateOfBirth": "1998-02-12",
      "idNo": "2324235",
       "gender": "male",
       "relationship": "mother",
       "telephone": "3435346463"
    }
}
```
