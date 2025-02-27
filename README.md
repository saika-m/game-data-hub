# Game-Data-Hub

<div align="center">

![Game-Data-Hub Logo](https://via.placeholder.com/150)

A powerful backend service developed with **Spring Boot** providing RESTful APIs for game-related data management

</div>

## ✨ Features

- **Spring Boot Framework**: Simplifies the development and deployment of Java applications
- **RESTful APIs**: Manage game data such as player profiles, statistics, and leaderboards
- **Database Integration**: Utilizes a relational database for persistent storage
- **Security**: Implements basic authentication for secure access to APIs
- **Swagger Documentation**: Provides interactive API documentation for easy exploration and testing

## 📋 Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher
- **Maven**: Dependency management and build tool
- **Git**: Version control system

## 🚀 Getting Started

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/saika-m/game-data-hub.git
   cd game-data-hub
   ```

2. **Build the project**:

   ```bash
   mvn clean install
   ```

3. **Run the application**:

   ```bash
   mvn spring-boot:run
   ```

   The application will start on `http://localhost:8080`.

### Database Configuration

1. **Create a database**: Create a database named `game_data` in your preferred relational database system.

2. **Configure database connection**: Update the `application.properties` file located in `src/main/resources` with your database connection details:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/game_data
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

## 📡 API Endpoints

### Player Profiles

| Method | Endpoint            | Description          |
|--------|---------------------|----------------------|
| POST   | `/api/players`      | Create Player Profile|
| GET    | `/api/players/{id}` | Get Player Profile   |
| PUT    | `/api/players/{id}` | Update Player Profile|
| DELETE | `/api/players/{id}` | Delete Player Profile|

### Game Statistics

| Method | Endpoint             | Description           |
|--------|----------------------|-----------------------|
| POST   | `/api/gamestats`     | Create Game Statistics|
| GET    | `/api/gamestats/{id}`| Get Game Statistics   |
| PUT    | `/api/gamestats/{id}`| Update Game Statistics|
| DELETE | `/api/gamestats/{id}`| Delete Game Statistics|

### Leaderboards

| Method | Endpoint            | Description     |
|--------|---------------------|-----------------|
| GET    | `/api/leaderboard`  | Get Leaderboard |

## 📚 Swagger Documentation

Interactive API documentation is available at `http://localhost:8080/swagger-ui.html` for easy exploration and testing of the API endpoints.

## 🤝 Contributing

Contributions are welcome! To get started:

1. Fork the repository
2. Create a new branch: `git checkout -b feature/your-feature-name`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/your-feature-name`
5. Open a pull request

## 📄 License

This project is licensed under the Apache 2.0 License. See the LICENSE file for details.

## 🏷️ Tags

`spring-boot` `game-data` `backend-service` `RESTful-API` `player-profiles` `game-statistics` `leaderboards` `swagger`
