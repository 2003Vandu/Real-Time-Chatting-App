<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Real-Time Anonymous Chat: Interactive Project Blueprint</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <style>
        body { font-family: 'Inter', sans-serif; }
        .chart-container { 
            position: relative; 
            width: 100%; 
            max-width: 600px; 
            margin-left: auto; 
            margin-right: auto; 
            height: 300px; 
            max-height: 400px; 
        }
        @media (min-width: 768px) { .chart-container { height: 350px; } }
        
        /* Custom Scrollbar for code blocks */
        .code-scroll::-webkit-scrollbar { height: 8px; }
        .code-scroll::-webkit-scrollbar-track { background: #f1f1f1; }
        .code-scroll::-webkit-scrollbar-thumb { background: #d1d5db; border-radius: 4px; }
        .code-scroll::-webkit-scrollbar-thumb:hover { background: #9ca3af; }

        .feature-card:hover { transform: translateY(-2px); transition: all 0.3s ease; }
    </style>
    <!-- Chosen Palette: Warm Neutrals with Slate & Ember Accents. 
         Background: Stone-50 (#fafaf9). 
         Text: Stone-800 (#292524). 
         Primary: Slate-700 (#334155). 
         Accent: Orange-500 (#f97316). -->
    <!-- Application Structure Plan: 
         1. Hero: Immediate value proposition of the project.
         2. System Architecture (Visual): A conceptual breakdown of the tech stack using charts to show relationships.
         3. Feature Matrix: Interactive cards detailing the core capabilities.
         4. The Socket Protocol (Interactive Simulation): A dynamic section that simulates the event loop described in the README to teach the user how the app works.
         5. Implementation Guide: A tabbed, stepper-based interface for the "Getting Started" instructions.
         6. Project Anatomy: A tree-view explorer for the file structure.
         WHY: This structure moves from "What is it?" (Hero/Arch) to "How does it work?" (Protocol) to "How do I build it?" (Guide), catering to the user's learning journey. -->
    <!-- Visualization & Content Choices:
         1. Tech Stack (Polar Area Chart): Visualizes the components (Spring, Mongo, etc.) to show the ecosystem balance.
         2. Latency Comparison (Bar Chart): Justifies the use of Socket.IO (a key feature) by comparing it conceptually to polling.
         3. Socket Traffic (Line Chart): Part of the simulator, visualizes real-time data flow.
         4. Code Blocks: Styled HTML pre/code tags for the config/commands.
         5. Icons: Unicode characters to avoid SVG.
         Confirming NO SVG/Mermaid. -->
    <!-- CONFIRMATION: NO SVG graphics used. NO Mermaid JS used. -->
</head>
<body class="bg-stone-50 text-stone-800 antialiased selection:bg-orange-200 selection:text-orange-900">

    <!-- Navigation -->
    <nav class="bg-white border-b border-stone-200 sticky top-0 z-50">
        <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
            <div class="flex justify-between h-16">
                <div class="flex items-center">
                    <span class="text-2xl font-bold tracking-tight text-slate-800">
                        Chat<span class="text-orange-500">App</span> Blueprint
                    </span>
                </div>
                <div class="hidden md:flex items-center space-x-8">
                    <button onclick="scrollToSection('architecture')" class="text-stone-600 hover:text-orange-600 transition-colors font-medium">Architecture</button>
                    <button onclick="scrollToSection('protocol')" class="text-stone-600 hover:text-orange-600 transition-colors font-medium">Protocol Simulator</button>
                    <button onclick="scrollToSection('setup')" class="text-stone-600 hover:text-orange-600 transition-colors font-medium">Setup Guide</button>
                </div>
            </div>
        </div>
    </nav>

    <!-- Hero Section -->
    <header class="bg-white py-16 sm:py-24 border-b border-stone-100">
        <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 text-center">
            <h1 class="text-4xl sm:text-5xl font-extrabold text-slate-900 mb-6">
                Real-Time. Anonymous. <span class="text-orange-500">Connected.</span>
            </h1>
            <p class="text-xl text-stone-600 max-w-2xl mx-auto mb-10">
                Explore the architecture of a robust multi-user chat application powered by Spring Boot, Socket.IO, and MongoDB. No registration required—just code and connect.
            </p>
            <div class="flex justify-center gap-4">
                <button onclick="scrollToSection('setup')" class="px-8 py-3 bg-slate-800 text-white font-semibold rounded-lg shadow-lg hover:bg-slate-700 transition-all hover:-translate-y-1">
                    Start Building
                </button>
                <button onclick="scrollToSection('features')" class="px-8 py-3 bg-white text-slate-700 border border-slate-200 font-semibold rounded-lg shadow-sm hover:bg-stone-50 transition-all">
                    View Features
                </button>
            </div>
        </div>
    </header>

    <!-- Section 1: Architecture & Technology -->
    <section id="architecture" class="py-16 max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
        <div class="mb-12">
            <h2 class="text-3xl font-bold text-slate-900 mb-4">System Architecture</h2>
            <p class="text-lg text-stone-600 max-w-3xl">
                The application relies on a modern, event-driven stack. This section breaks down the technologies used to achieve low-latency communication and data persistence. The chart below illustrates the conceptual role distribution of the stack.
            </p>
        </div>

        <div class="grid grid-cols-1 lg:grid-cols-2 gap-12 items-center">
            <!-- Content Column -->
            <div class="space-y-6">
                <div class="p-6 bg-white rounded-xl shadow-sm border border-stone-200 hover:border-orange-300 transition-colors">
                    <h3 class="text-xl font-bold text-slate-800 flex items-center gap-2">
                        <span class="text-2xl">⚡</span> Spring Boot (Backend)
                    </h3>
                    <p class="mt-2 text-stone-600">The core framework providing the RESTful foundation and hosting the Socket.IO server. Ensures stability and ease of deployment.</p>
                </div>
                <div class="p-6 bg-white rounded-xl shadow-sm border border-stone-200 hover:border-orange-300 transition-colors">
                    <h3 class="text-xl font-bold text-slate-800 flex items-center gap-2">
                        <span class="text-2xl">📡</span> Socket.IO (Real-Time)
                    </h3>
                    <p class="mt-2 text-stone-600">Enables bi-directional, event-based communication. This is the engine that pushes messages instantly to all clients.</p>
                </div>
                <div class="p-6 bg-white rounded-xl shadow-sm border border-stone-200 hover:border-orange-300 transition-colors">
                    <h3 class="text-xl font-bold text-slate-800 flex items-center gap-2">
                        <span class="text-2xl">💾</span> MongoDB (Database)
                    </h3>
                    <p class="mt-2 text-stone-600">A NoSQL document store that handles message persistence and user session data flexibly.</p>
                </div>
            </div>

            <!-- Chart Column -->
            <div class="bg-white p-6 rounded-2xl shadow-lg border border-stone-100">
                <h4 class="text-sm font-bold text-stone-500 uppercase tracking-wide mb-4 text-center">Tech Stack Roles</h4>
                <!-- Chart Container -->
                <div class="chart-container">
                    <canvas id="techStackChart"></canvas>
                </div>
                <p class="text-xs text-center text-stone-400 mt-4">Conceptual visualization of stack component responsibility</p>
            </div>
        </div>
    </section>

    <!-- Section 2: Features Grid -->
    <section id="features" class="py-16 bg-stone-100">
        <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
            <h2 class="text-3xl font-bold text-slate-900 mb-4 text-center">Core Features</h2>
            <p class="text-lg text-stone-600 text-center max-w-3xl mx-auto mb-12">
                Designed for speed and privacy. Hover over a feature card to reveal implementation details derived from the project structure.
            </p>

            <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6">
                <!-- Feature 1 -->
                <div class="feature-card bg-white p-6 rounded-xl shadow-sm border border-stone-200 cursor-default">
                    <div class="text-4xl mb-4">⏱️</div>
                    <h3 class="text-lg font-bold text-slate-800 mb-2">Real-Time Messaging</h3>
                    <p class="text-stone-600 text-sm">Instant delivery via WebSockets. No page refreshes required.</p>
                </div>
                <!-- Feature 2 -->
                <div class="feature-card bg-white p-6 rounded-xl shadow-sm border border-stone-200 cursor-default">
                    <div class="text-4xl mb-4">👥</div>
                    <h3 class="text-lg font-bold text-slate-800 mb-2">Multi-User Support</h3>
                    <p class="text-stone-600 text-sm">Concurrent connections handled efficiently by the async IO backend.</p>
                </div>
                <!-- Feature 3 -->
                <div class="feature-card bg-white p-6 rounded-xl shadow-sm border border-stone-200 cursor-default">
                    <div class="text-4xl mb-4">🕵️</div>
                    <h3 class="text-lg font-bold text-slate-800 mb-2">Anonymous Access</h3>
                    <p class="text-stone-600 text-sm">Auto-generated IDs (e.g., "anon-123"). Zero friction onboarding.</p>
                </div>
                <!-- Feature 4 -->
                <div class="feature-card bg-white p-6 rounded-xl shadow-sm border border-stone-200 cursor-default">
                    <div class="text-4xl mb-4">📦</div>
                    <h3 class="text-lg font-bold text-slate-800 mb-2">Persistence</h3>
                    <p class="text-stone-600 text-sm">History loading on join. Messages survive server restarts via MongoDB.</p>
                </div>
            </div>
        </div>
    </section>

    <!-- Section 3: Protocol Simulator (The "Wow" Factor) -->
    <section id="protocol" class="py-16 max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
        <div class="mb-12">
            <h2 class="text-3xl font-bold text-slate-900 mb-4">Protocol Simulator</h2>
            <p class="text-lg text-stone-600 max-w-3xl">
                Understanding the WebSocket events is critical for building the client. This interactive simulator demonstrates the <strong>Event Loop</strong> defined in the README. Click the buttons to trigger events and watch the server response and data traffic visualization.
            </p>
        </div>

        <div class="grid grid-cols-1 lg:grid-cols-3 gap-8">
            <!-- Controls -->
            <div class="lg:col-span-1 space-y-6">
                <div class="bg-white p-6 rounded-xl shadow-sm border border-stone-200">
                    <h3 class="font-bold text-slate-800 mb-4 border-b border-stone-100 pb-2">Client Actions</h3>
                    <div class="space-y-4">
                        <button id="btn-connect" class="w-full text-left px-4 py-3 bg-slate-50 hover:bg-slate-100 rounded-lg border border-slate-200 transition-colors flex items-center justify-between group">
                            <span>1. Connect & Join</span>
                            <span class="text-xs font-mono text-slate-400 group-hover:text-orange-500">user:join</span>
                        </button>
                        <button id="btn-msg" class="w-full text-left px-4 py-3 bg-slate-50 hover:bg-slate-100 rounded-lg border border-slate-200 transition-colors flex items-center justify-between group opacity-50 cursor-not-allowed" disabled>
                            <span>2. Send Message</span>
                            <span class="text-xs font-mono text-slate-400 group-hover:text-orange-500">message:send</span>
                        </button>
                    </div>
                </div>

                <div class="bg-white p-6 rounded-xl shadow-sm border border-stone-200">
                    <h3 class="font-bold text-slate-800 mb-4 border-b border-stone-100 pb-2">Traffic Monitor</h3>
                    <div class="chart-container" style="height: 200px;">
                        <canvas id="trafficChart"></canvas>
                    </div>
                </div>
            </div>

            <!-- Console Output -->
            <div class="lg:col-span-2">
                <div class="bg-slate-900 rounded-xl shadow-lg overflow-hidden flex flex-col h-[500px]">
                    <div class="bg-slate-800 px-4 py-3 flex items-center justify-between border-b border-slate-700">
                        <span class="text-slate-200 font-mono text-sm">Server Event Log</span>
                        <div class="flex gap-2">
                            <div class="w-3 h-3 rounded-full bg-red-500"></div>
                            <div class="w-3 h-3 rounded-full bg-yellow-500"></div>
                            <div class="w-3 h-3 rounded-full bg-green-500"></div>
                        </div>
                    </div>
                    <div id="console-output" class="p-4 font-mono text-sm text-green-400 overflow-y-auto flex-1 space-y-2">
                        <div class="text-slate-500 opacity-50">// System ready. Waiting for connection...</div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Section 4: Implementation Guide -->
    <section id="setup" class="py-16 bg-white border-t border-stone-100">
        <div class="max-w-5xl mx-auto px-4 sm:px-6 lg:px-8">
            <h2 class="text-3xl font-bold text-slate-900 mb-8 text-center">Implementation Guide</h2>
            <p class="text-center text-stone-600 mb-12">Follow this step-by-step roadmap to get the backend running locally.</p>

            <!-- Steps UI -->
            <div class="flex flex-col md:flex-row gap-8">
                <!-- Step Navigation -->
                <div class="md:w-1/4 flex flex-col gap-2">
                    <button onclick="showStep(1)" id="nav-step-1" class="step-nav active px-4 py-3 rounded-lg text-left font-medium transition-colors bg-orange-50 text-orange-700 border-l-4 border-orange-500">1. Prerequisites</button>
                    <button onclick="showStep(2)" id="nav-step-2" class="step-nav px-4 py-3 rounded-lg text-left font-medium text-stone-600 hover:bg-stone-50 transition-colors border-l-4 border-transparent">2. Database</button>
                    <button onclick="showStep(3)" id="nav-step-3" class="step-nav px-4 py-3 rounded-lg text-left font-medium text-stone-600 hover:bg-stone-50 transition-colors border-l-4 border-transparent">3. Build & Run</button>
                    <button onclick="showStep(4)" id="nav-step-4" class="step-nav px-4 py-3 rounded-lg text-left font-medium text-stone-600 hover:bg-stone-50 transition-colors border-l-4 border-transparent">4. Client Setup</button>
                </div>

                <!-- Step Content -->
                <div class="md:w-3/4 bg-stone-50 rounded-2xl p-8 border border-stone-200 min-h-[400px]">
                    <!-- Step 1 Content -->
                    <div id="step-1" class="step-content animate-fade-in">
                        <h3 class="text-2xl font-bold text-slate-800 mb-4">System Prerequisites</h3>
                        <p class="mb-6 text-stone-600">Ensure your environment meets these requirements before starting.</p>
                        <ul class="space-y-4">
                            <li class="flex items-center gap-3 bg-white p-4 rounded-lg shadow-sm">
                                <span class="text-green-500 text-xl">✓</span>
                                <div>
                                    <strong class="block text-slate-800">JDK 17+</strong>
                                    <span class="text-sm text-stone-500">Required for Spring Boot 3.x</span>
                                </div>
                            </li>
                            <li class="flex items-center gap-3 bg-white p-4 rounded-lg shadow-sm">
                                <span class="text-green-500 text-xl">✓</span>
                                <div>
                                    <strong class="block text-slate-800">MongoDB Instance</strong>
                                    <span class="text-sm text-stone-500">Localhost:27017 or Cloud Atlas</span>
                                </div>
                            </li>
                            <li class="flex items-center gap-3 bg-white p-4 rounded-lg shadow-sm">
                                <span class="text-green-500 text-xl">✓</span>
                                <div>
                                    <strong class="block text-slate-800">Maven or Gradle</strong>
                                    <span class="text-sm text-stone-500">For dependency management</span>
                                </div>
                            </li>
                        </ul>
                    </div>

                    <!-- Step 2 Content -->
                    <div id="step-2" class="step-content hidden animate-fade-in">
                        <h3 class="text-2xl font-bold text-slate-800 mb-4">Configure MongoDB</h3>
                        <p class="mb-6 text-stone-600">Edit <code>src/main/resources/application.properties</code> to connect to your database.</p>
                        
                        <div class="bg-slate-900 rounded-lg p-4 overflow-x-auto code-scroll">
<pre class="text-sm font-mono text-slate-300">
<span class="text-stone-500"># Server configuration</span>
server.port=<span class="text-orange-400">8080</span>

<span class="text-stone-500"># MongoDB Configuration</span>
spring.data.mongodb.host=<span class="text-green-400">localhost</span>
spring.data.mongodb.port=<span class="text-green-400">27017</span>
spring.data.mongodb.database=<span class="text-green-400">realtime-chat-db</span>

<span class="text-stone-500"># Or use URI for Auth</span>
<span class="text-stone-500"># spring.data.mongodb.uri=mongodb://user:pass@host:port/db</span>
</pre>
                        </div>
                    </div>

                    <!-- Step 3 Content -->
                    <div id="step-3" class="step-content hidden animate-fade-in">
                        <h3 class="text-2xl font-bold text-slate-800 mb-4">Build & Run</h3>
                        <p class="mb-6 text-stone-600">Choose your build tool to start the server.</p>
                        
                        <div class="mb-4">
                            <span class="text-sm font-bold text-slate-700 uppercase tracking-wide">Maven</span>
                            <div class="bg-slate-900 rounded-lg p-4 mt-2 mb-6 font-mono text-sm text-white">
                                mvn clean package<br>
                                java -jar target/app.jar
                            </div>

                            <span class="text-sm font-bold text-slate-700 uppercase tracking-wide">Gradle</span>
                            <div class="bg-slate-900 rounded-lg p-4 mt-2 font-mono text-sm text-white">
                                ./gradlew bootRun
                            </div>
                        </div>
                    </div>

                    <!-- Step 4 Content -->
                    <div id="step-4" class="step-content hidden animate-fade-in">
                        <h3 class="text-2xl font-bold text-slate-800 mb-4">Frontend Connection</h3>
                        <p class="mb-6 text-stone-600">The server hosts a static client or you can connect remotely. Here is the connection logic.</p>
                        
                        <div class="bg-slate-900 rounded-lg p-4 overflow-x-auto code-scroll">
<pre class="text-sm font-mono text-slate-300">
<span class="text-purple-400">const</span> socket = io(<span class="text-green-400">"http://localhost:8080"</span>);

<span class="text-stone-500">// 1. Join immediately</span>
socket.emit(<span class="text-green-400">'user:join'</span>);

<span class="text-stone-500">// 2. Listen for assignment</span>
socket.on(<span class="text-green-400">'user:assigned'</span>, (data) => {
    console.log(<span class="text-green-400">"My ID:"</span>, data.userId);
});

<span class="text-stone-500">// 3. Receive messages</span>
socket.on(<span class="text-green-400">'message:new'</span>, (msg) => {
    displayMessage(msg);
});
</pre>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Section 5: Project Anatomy -->
    <section class="py-16 bg-stone-100">
        <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
            <h2 class="text-3xl font-bold text-slate-900 mb-8 text-center">Project Structure</h2>
            <div class="grid grid-cols-1 md:grid-cols-2 gap-8">
                <div>
                    <p class="text-lg text-stone-600 mb-6">
                        The backend is organized into standard Spring Boot layers, separating concerns between networking (Socket), logic (Service), and data (Repository).
                    </p>
                    <!-- Chart for Logic Distribution -->
                    <div class="bg-white p-6 rounded-2xl shadow-lg border border-stone-200">
                        <h4 class="text-sm font-bold text-stone-500 uppercase tracking-wide mb-4 text-center">Logic Distribution</h4>
                        <div class="chart-container" style="height: 250px;">
                            <canvas id="structureChart"></canvas>
                        </div>
                    </div>
                </div>

                <div class="bg-white p-8 rounded-2xl shadow-sm border border-stone-200 font-mono text-sm">
                    <ul class="space-y-4 text-slate-700">
                        <li class="pl-0"><span class="text-orange-500">📁 src/main/java</span></li>
                        <li class="pl-4 border-l-2 border-stone-200 ml-1">
                            <span class="text-slate-900 font-bold">controller/</span>
                            <div class="text-stone-500 text-xs mt-1">ChatController.java (HTTP Health checks)</div>
                        </li>
                        <li class="pl-4 border-l-2 border-stone-200 ml-1">
                            <span class="text-slate-900 font-bold">socket/</span>
                            <div class="text-stone-500 text-xs mt-1">SocketIoModule.java (Event listeners)</div>
                        </li>
                        <li class="pl-4 border-l-2 border-stone-200 ml-1">
                            <span class="text-slate-900 font-bold">service/</span>
                            <div class="text-stone-500 text-xs mt-1">ChatService.java (Business logic)</div>
                        </li>
                        <li class="pl-4 border-l-2 border-stone-200 ml-1">
                            <span class="text-slate-900 font-bold">model/</span>
                            <div class="text-stone-500 text-xs mt-1">ChatMessage.java, User.java</div>
                        </li>
                        <li class="pl-4 border-l-2 border-stone-200 ml-1">
                            <span class="text-slate-900 font-bold">repository/</span>
                            <div class="text-stone-500 text-xs mt-1">ChatMessageRepository.java (MongoDB Interface)</div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </section>

    <!-- Footer -->
    <footer class="bg-slate-900 text-slate-400 py-12 border-t border-slate-800">
        <div class="max-w-7xl mx-auto px-4 text-center">
            <p>&copy; 2023 Real-Time Chat Application Project. Built with Spring Boot & Socket.IO.</p>
        </div>
    </footer>

    <!-- JavaScript Logic -->
    <script>
        // --- 1. Navigation & UI Logic ---
        function scrollToSection(id) {
            document.getElementById(id).scrollIntoView({ behavior: 'smooth' });
        }

        function showStep(stepNum) {
            // Hide all contents
            document.querySelectorAll('.step-content').forEach(el => el.classList.add('hidden'));
            // Show target
            document.getElementById(`step-${stepNum}`).classList.remove('hidden');
            
            // Reset nav styles
            document.querySelectorAll('.step-nav').forEach(el => {
                el.classList.remove('bg-orange-50', 'text-orange-700', 'border-orange-500', 'active');
                el.classList.add('text-stone-600', 'border-transparent');
            });
            // Set active nav style
            const activeNav = document.getElementById(`nav-step-${stepNum}`);
            activeNav.classList.remove('text-stone-600', 'border-transparent');
            activeNav.classList.add('bg-orange-50', 'text-orange-700', 'border-orange-500', 'active');
        }

        // --- 2. Chart Configurations ---
        
        // Chart 1: Tech Stack (Polar Area)
        const ctxStack = document.getElementById('techStackChart').getContext('2d');
        new Chart(ctxStack, {
            type: 'polarArea',
            data: {
                labels: ['Spring Boot', 'Socket.IO', 'MongoDB', 'Client (JS)'],
                datasets: [{
                    label: 'System Importance',
                    data: [40, 30, 20, 10], // Conceptual weights
                    backgroundColor: [
                        'rgba(51, 65, 85, 0.8)',  // Slate 700
                        'rgba(249, 115, 22, 0.8)', // Orange 500
                        'rgba(34, 197, 94, 0.8)',  // Green 500
                        'rgba(148, 163, 184, 0.8)' // Slate 400
                    ],
                    borderWidth: 1
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                scales: {
                    r: { ticks: { display: false }, grid: { color: '#e7e5e4' } }
                },
                plugins: {
                    legend: { position: 'bottom' }
                }
            }
        });

        // Chart 2: Project Structure (Doughnut)
        const ctxStructure = document.getElementById('structureChart').getContext('2d');
        new Chart(ctxStructure, {
            type: 'doughnut',
            data: {
                labels: ['Networking (Socket)', 'Business Logic (Service)', 'Data Persistence (Repo)', 'Models'],
                datasets: [{
                    data: [35, 25, 25, 15],
                    backgroundColor: ['#f97316', '#334155', '#475569', '#cbd5e1'],
                    borderWidth: 0
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                plugins: {
                    legend: { display: false } // Hiding legend to keep it clean, relying on context
                }
            }
        });

        // Chart 3: Real-Time Traffic (Line - Dynamic)
        const ctxTraffic = document.getElementById('trafficChart').getContext('2d');
        const trafficChart = new Chart(ctxTraffic, {
            type: 'line',
            data: {
                labels: Array(10).fill(''),
                datasets: [{
                    label: 'Event Packets',
                    data: Array(10).fill(0),
                    borderColor: '#f97316',
                    backgroundColor: 'rgba(249, 115, 22, 0.1)',
                    fill: true,
                    tension: 0.4,
                    pointRadius: 2
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                scales: {
                    y: { beginAtZero: true, max: 10, display: false },
                    x: { display: false }
                },
                plugins: { legend: { display: false } },
                animation: { duration: 500 }
            }
        });

        // --- 3. Protocol Simulator Logic ---
        const consoleOutput = document.getElementById('console-output');
        const btnConnect = document.getElementById('btn-connect');
        const btnMsg = document.getElementById('btn-msg');
        let isConnected = false;
        let userId = null;

        function log(text, type = 'info') {
            const div = document.createElement('div');
            div.className = "font-mono text-sm border-l-2 pl-2 mb-1";
            if (type === 'out') {
                div.classList.add('text-blue-400', 'border-blue-400');
                div.innerHTML = `<span class="opacity-70">CLIENT -> SERVER:</span> ${text}`;
            } else if (type === 'in') {
                div.classList.add('text-green-400', 'border-green-400');
                div.innerHTML = `<span class="opacity-70">SERVER -> CLIENT:</span> ${text}`;
            } else {
                div.classList.add('text-stone-500', 'border-stone-500');
                div.innerText = text;
            }
            consoleOutput.appendChild(div);
            consoleOutput.scrollTop = consoleOutput.scrollHeight;
            
            // Spike the chart
            updateTraffic();
        }

        function updateTraffic() {
            const data = trafficChart.data.datasets[0].data;
            data.shift();
            data.push(Math.floor(Math.random() * 5) + 3); // Random spike
            trafficChart.update();
            
            // Decay back to 0
            setTimeout(() => {
                const d = trafficChart.data.datasets[0].data;
                d.shift();
                d.push(0);
                trafficChart.update();
            }, 800);
        }

        btnConnect.addEventListener('click', () => {
            if (isConnected) return;
            
            // 1. Client sends join
            log("Emit 'user:join'", 'out');
            
            // 2. Server Processing Delay
            setTimeout(() => {
                userId = "anon-" + Math.floor(Math.random() * 9000 + 1000);
                log(`Event 'user:assigned' { userId: "${userId}" }`, 'in');
                
                setTimeout(() => {
                    log(`Event 'chat:history' [ ... loading 50 msgs ... ]`, 'in');
                    isConnected = true;
                    btnConnect.classList.add('opacity-50', 'cursor-not-allowed');
                    btnConnect.innerHTML = `<span>✓ Connected as ${userId}</span>`;
                    
                    // Enable Message Button
                    btnMsg.disabled = false;
                    btnMsg.classList.remove('opacity-50', 'cursor-not-allowed');
                    btnMsg.classList.add('bg-orange-50', 'border-orange-200', 'text-orange-900');
                }, 600);
            }, 500);
        });

        btnMsg.addEventListener('click', () => {
            if (!isConnected) return;

            const msgs = ["Hello world!", "Is anyone here?", "Socket.IO is cool", "Java Spring Boot ftw"];
            const content = msgs[Math.floor(Math.random() * msgs.length)];

            // 1. Client Sends
            log(`Emit 'message:send' { content: "${content}", senderId: "${userId}" }`, 'out');

            // 2. Server Broadcasts
            setTimeout(() => {
                log(`Broadcast 'message:new' { id: "msg-${Date.now()}", content: "${content}"... }`, 'in');
            }, 300);
        });

    </script>
</body>
</html>
