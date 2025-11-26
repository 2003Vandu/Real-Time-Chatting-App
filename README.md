Real-Time Anonymous Chat Application
*This project is a multi-user, real-time chat application designed to facilitate anonymous conversations. It uses a robust Spring Boot backend integrated with Socket.IO for low-latency communication and MongoDB for persistent message storage

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
| Build Tool | Gradle | Dependency management and build automation. |
| Client | Vanilla HTML, CSS, JS | The client-side application connects via the Socket.IO client library and is served from the Spring Boot static folder. |

⚙️ Prerequisites

Before running the application, ensure you have the following installed:

Java Development Kit (JDK): Version 17 or later.

Maven or Gradle: [Replace this with your chosen build tool (e.g., Maven) in your final version.]

Node.js & npm: Recommended for managing client-side dependencies (like the Socket.IO client library), though the client runs purely in the browser as a static HTML/JS page.

MongoDB Instance: A running instance of MongoDB (local or cloud-hosted).
