# RusticRide Backend

This is the backend for the RusticRide ride booking app, built with Spring Boot.

##Config is not for PRODUCTION.
## Requirements
- Java 17+
- Maven
- PostgreSQL (or your preferred database)

## Setup

1. **Clone the repository**
2. **Configure your database** in `src/main/resources/application.properties` (see below)
3. **Build the project:**
   ```bash
   mvn clean install
   ```
4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

## Database Configuration Example

```
spring.datasource.url=jdbc:postgresql://localhost:5432/rusticride
spring.datasource.username=adhiman_postgres
spring.datasource.password=newPassword@3
spring.jpa.hibernate.ddl-auto=update
```

## Main Features
- User and driver management
- Ride booking and tracking
- Secure authentication

---
