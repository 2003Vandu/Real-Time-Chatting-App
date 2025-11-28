# 🌐 Real-Time Anonymous Chat Application

> Built for instant, anonymous group chat — no signups, no tracking. Powered by Spring Boot + WebSocket + MongoDB.

This project is a multi-user, real-time chat application designed to facilitate instant, anonymous conversations. It uses a robust Spring Boot backend integrated with WebSocket for low-latency communication and MongoDB for persistent message storage.
# Demo

https://github.com/user-attachments/assets/ab1abf49-d929-4172-b840-e591250c060c

✨ Features

Real-Time Messaging: Instantaneous message delivery using WebSocket.

Multi-User Support: Multiple users can join and exchange messages concurrently.

Anonymous Access: Users do not need to register; they are assigned a unique, anonymous identifier upon connecting.

Message Persistence: All chat messages are stored in MongoDB and loaded upon connecting to ensure history is available.

Robust Backend: Built with Spring Boot for stability and easy deployment.

🛠️ Tech Stack

| Component | Technology         | Description                                                                                                                      |
|---|--------------------|----------------------------------------------------------------------------------------------------------------------------------|
| Backend Framework | Spring Boot (Java) | Simplifies Java application development and provides a RESTful foundation.                                                       |
| Real-Time Layer | WebSocket (Server) | Enables reliable, bi-directional, and event-based communication.                                                                 |
| Database | MongoDB            | NoSQL document database for flexible storage of chat messages and user state.                                                    |
| Build Tool | Maven              | Dependency management and build automation.                                                                                      |
| Client | HTML, CSS, JS      | The client-side application connects via the Socketjs and STOMP client library and is served from the Spring Boot static folder. |

⚙️ Prerequisites

Ensure you have the following installed and running:

     Java Development Kit (JDK): Version 17 or later.

     Maven or Gradle: For building the Spring Boot application.

     MongoDB Instance: A running instance of MongoDB (local or cloud-hosted).🚀 Getting Started (Backend)

Follow these steps to get your Spring Boot webSocket server up and running.

    1. Clone the Repository

    git clone https://github.com/2003Vandu/Real-Time-Chatting-App.git
    cd  Real-Time-Chatting-App

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


The Spring Boot application will start and host the WebSocket server on http://localhost:8080.

🧑‍💻 Usage (Frontend Client)

The frontend client is a single HTML file that connects to the running backend.

1. Client Access

    The client (e.g., the provided index.html) is designed to run in any browser.

   Connection URL: The client connects directly to the server: http://localhost:8080.

Key Socket Events (Client/Server Communication)
| Event Name      | Direction         | Description                                      | Payload Example                                  |
|-----------------|-------------------|--------------------------------------------------|--------------------------------------------------|
| message:send    | Client → Server   | Used by the client to send a new chat message.   | `{ content: "Hello, world!", senderId: "anon-123" }` |
| message:new     | Server → All Clients | Broadcasts a new message to all connected users in real-time. | `{ id: "msg-42", content: "...", senderId: "...", timestamp: "..." }` |
| user:join       | Client → Server   | Sent when a user successfully connects to request an anonymous ID. | `None` |
| user:assigned   | Server → Client   | Assigns a unique anonymous ID to the new user.   | `{ userId: "anon-123" }`                         |
| chat:history    | Server → Client   | Sends the recent message history upon initial connection. | `[{ id: "...", content: "...", ... }]`           |

3. Workflow

       Connect: The client initializes the WebSocket connection to http://localhost:8080.

       Identify: The client immediately emits the user:join event.

       Receive ID & History: The server responds with the user:assigned event (providing the anonymous ID) and the chat:history event.

       Chat: Users send messages using the message:send event. The server saves the message to MongoDB and broadcasts it in real-time using the message:new event to all clients.
