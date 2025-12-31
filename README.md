# Fix-ed: Technician Service App

Fix-ed is a comprehensive on-demand platform designed to connect users with qualified technicians for various home and professional services. Built as a client-server application, it provides a seamless experience for service booking, tracking, and management.

## 🚀 Key Features

- **User Authentication**: Secure registration, login, and password management for users and technicians.
- **Service Request Management**: Easy submission and real-time tracking of service requests.
- **Technician Discovery**: Search for technicians based on skills, view profiles, and book appointments.
- **Real-Time Scheduling**: Efficient appointment coordination with instant notifications.
- **Secure Payments**: Integrated system for handling payments, receipts, and refunds.
- **AI-Powered Recommendations**: Intelligent technician suggestions based on user preferences and history.
- **Admin Dashboard**: Centralized console for monitoring system performance and user management.

## 🛠️ Technology Stack

- **Frontend**: JavaFX (Client Interface)
- **Backend**: Java (Multi-client Socket Server)
- **Database**: MySQL
- **Build Tool**: Maven
- **Communication**: Socket-based networking (TCP)

## 📁 Project Structure

```text
Fixed/
├── backend/            # Java Socket Server
│   ├── src/main/java   # Core logic, Services, and DB handling
│   ├── database/       # SQL Schema and migration scripts
│   └── pom.xml         # Backend dependencies
├── frontend/           # JavaFX Client
│   ├── src/main/java   # UI Controllers, Sockets client, and Models
│   ├── src/main/resources # FXML files and assets
│   └── pom.xml         # Frontend dependencies
├── docs/               # Project documentation and demo assets
└── README.md           # Project overview
```

## ⚙️ Setup & Installation

### Prerequisites
- Java 19 or higher
- MySQL Server
- Maven

### 1. Database Setup
1. Open your MySQL client.
2. Create a database named `fixed2`.
3. Import the schema from `backend/database/schema.sql`.

### 2. Backend Configuration
1. Navigate to `backend/src/main/resources/config.properties`.
2. Update the database credentials (`db.user`, `db.password`) to match your local setup.

### 3. Running the Server
```bash
cd backend
mvn javafx:run
```
*Note: Ensure the server is running before starting the client.*

### 4. Running the Client
```bash
cd frontend
mvn javafx:run
```

## 👥 Contributors

- **Khalid Abdelsalam Mohamed**
- **Abdelrahman Amr Mohamed**
- **Taher Abdelbary Abdelmalek**

---
*Created as a Final Project for CSE352 Systems Analysis & Design at Alamein International University.*
