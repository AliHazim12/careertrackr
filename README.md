# CareerTrackr

## Live Application
https://careertrackr.onrender.com/

## GitHub Repository
https://github.com/AliHazim12/careertrackr

---

# Overview

CareerTrackr is a full-stack Spring Boot web application designed to help users organize and track job applications throughout the hiring process.

The application allows users to create, edit, update, and delete job applications while tracking statuses such as Applied, Screening, Interviewing, Offer, and Rejected.

This project was built as a portfolio-quality full-stack Java web application using Spring Boot, Thymeleaf, JPA, PostgreSQL, Docker, and cloud deployment services.

---

# Features

- Create new job applications
- Edit existing applications
- Delete applications
- Track application statuses
- Store notes and salary ranges
- Track applied dates and follow-up dates
- Persistent PostgreSQL cloud database
- Responsive CRUD workflow
- Validation for required fields
- Cloud deployment with Docker

---

# Technologies Used

## Backend
- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

## Frontend
- Thymeleaf
- HTML5
- CSS3

## Database
- H2 Database (local development)
- PostgreSQL (production)

## Deployment / DevOps
- GitHub for source control
- Render for cloud hosting
- Neon for PostgreSQL hosting
- Docker for containerized deployment

---

# CRUD Operations

The application supports full CRUD functionality:

Operation	          Description

- Create - Add new applications
- Read - View all applications
- Update - Edit application information
- Delete - Remove applications


## Validation

The application uses Jakarta Validation annotations including:

- @NotBlank
- @NotNull

Validation prevents incomplete or invalid form submissions.

# Application Architecture

The application follows a layered Spring Boot architecture:

```text
Controller Layer
↓
Service Layer
↓
Repository Layer
↓
Database Layer

