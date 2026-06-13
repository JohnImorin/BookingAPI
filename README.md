# Car Booking System REST API

A backend REST API for managing car bookings and customer reservations.

## Features

- Full CRUD operations for bookings
- Customer and vehicle management
- RESTful API design patterns
- PostgreSQL database integration
- Error handling and input validation
- Clean architecture (Entity, Repository, Service, Controller)

## Tech Stack

Java | Spring Boot | PostgreSQL | JPA/Hibernate | REST API

## Getting Started

```bash
git clone https://github.com/JohnImorin/BookingAPI.git
cd BookingAPI
```

Configure `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://your-host/booking_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Run:
```bash
mvn spring-boot:run
```

API runs on `http://localhost:8080`

## API Endpoints

- `GET /api/bookings` - Get all bookings
- `GET /api/bookings/{id}` - Get booking by ID
- `POST /api/bookings` - Create new booking
- `PUT /api/bookings/{id}` - Update booking
- `DELETE /api/bookings/{id}` - Cancel booking
- `GET /api/customers` - List customers
- `GET /api/vehicles` - List available vehicles

## Author

John Fabrice Imorin | CS Graduate | Junior Backend Developer  
📧 johnsteiner900@gmail.com | 🔗 [LinkedIn](https://linkedin.com/in/john-fabrice-imorin-526a4722b)
