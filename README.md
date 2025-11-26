                             ###  Real-Time Anonymous Chat Application

This project is a multi-user, real-time chat application designed to facilitate anonymous conversations. It uses a robust Spring Boot backend integrated with Socket.IO for low-latency communication and MongoDB for persistent message storage

✨ Features

Real-Time Messaging: Instantaneous message delivery using Socket.IO (WebSocket).

Multi-User Support: Multiple users can join the chat room and exchange messages concurrently.

Anonymous Access: Users do not need to register; they are assigned a unique, anonymous identifier upon connecting.

Message Persistence: All chat messages are stored in MongoDB and loaded upon connecting to ensure history is available.

Robust Backend: Built with Spring Boot, providing stability and easy deployment.

🛠️ Tech Stack

| Component | Technology | Description |
|---|---|---|
| Backend Framework | Spring Boot (Java) | Simplifies Java application development and provides a RESTful foundation. |
| Real-Time Layer | Socket.IO (Server) | Enables reliable, bi-directional, and event-based communication. |
| Database | MongoDB | NoSQL document database for flexible storage of chat messages and user state. |
| Build Tool | Maven | Dependency management and build automation. |
| Client | Vanilla HTML, CSS, JS | The client-side application connects via the Socket.IO client library and is served from the Spring Boot static folder. |

⚙️ Prerequisites

Before running the application, ensure you have the following installed:

    Java Development Kit (JDK): Version 17 or later.

    Maven or Gradle: [Replace this with your chosen build tool (e.g., Maven) in your final version.]

    Node.js & npm: Recommended for managing client-side dependencies (like the Socket.IO client library), though the client runs purely in the browser as a static HTML/JS page.

    MongoDB Instance: A running instance of MongoDB (local or cloud-hosted).
🚀 Getting Started (Backend)

Follow these steps to get your Spring Boot Socket.IO server up and running.

    1. Clone the Repository

    git clone [YOUR_REPOSITORY_URL]
    cd [project-folder-name]

    2. Configure MongoDB

    Update the src/main/resources/application.properties (or application.yml) file with your MongoDB connection details.

    Example application.properties configuration:

# Server configuration
    server.port=8080

# MongoDB Configuration
    spring.data.mongodb.host=localhost
    spring.data.mongodb.port=27017
    spring.data.mongodb.database=realtime-chat-db
    # spring.data.mongodb.uri=mongodb://username:password@host:port/database # Use this for auth

(Note: Ensure your MongoDB instance is running and accessible.)

3. Build and Run the Application

    Using Maven

# Package the application
    mvn clean package

    # Run the JAR file (replace 'app.jar' with the actual filename)
    java -jar target/app.jar



Using Gradle

    # Run the application directly (assuming Gradle wrapper is used)
    ./gradlew bootRun


The Spring Boot application will start and listen on the configured port (default is 8080).
📡 Socket.IO Connection Details

The Socket.IO server is hosted by the Spring Boot application.

    Detail               Value

    Server URL           http://localhost:8080 (or your deployment URL)
    Connection Path      Varies based on configuration. Often handled automatically by the client library.

Varies based on configuration. Often handled automatically by the client library.

Key Socket Events (Client/Server Communication)
| Event Name      | Direction         | Description                                      | Payload Example                                  |
|-----------------|-------------------|--------------------------------------------------|--------------------------------------------------|
| message:send    | Client → Server   | Used by the client to send a new chat message.   | `{ content: "Hello, world!", senderId: "anon-123" }` |
| message:new     | Server → All Clients | Broadcasts a new message to all connected users in real-time. | `{ id: "msg-42", content: "...", senderId: "...", timestamp: "..." }` |
| user:join       | Client → Server   | Sent when a user successfully connects to request an anonymous ID. | `None` |
| user:assigned   | Server → Client   | Assigns a unique anonymous ID to the new user.   | `{ userId: "anon-123" }`                         |
| chat:history    | Server → Client   | Sends the recent message history upon initial connection. | `[{ id: "...", content: "...", ... }]`           |

🧑‍💻 Usage (Frontend Client)

To interact with the application, you need a separate frontend client (e.g., an HTML/JS page or a framework-based application) that connects using the Socket.IO client library.

Connect the Socket.IO client to the backend URL (http://localhost:8080).

The client should immediately emit a user:join event.

Wait for the server to respond with the user:assigned event containing the userId.

The server will also send the initial chat:history via the appropriate event.

Use the assigned userId to send messages using the message:send event.

🛑 Project Structure (Backend)

The main components of the Spring Boot application are likely structured as follows:

    controller/

ChatController.java: Handles HTTP requests (e.g., health check).

    socket/

SocketIoModule.java: Configures the Socket.IO server and listener endpoints.

    model/

ChatMessage.java: MongoDB document model for messages.

User.java: Simple model for an anonymous user session.

    repository/

ChatMessageRepository.java: Spring Data MongoDB repository for CRUD operations.

    service/

ChatService.java: Business logic for saving, retrieving, and broadcasting messages.
