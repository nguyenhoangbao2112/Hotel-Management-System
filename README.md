# Hotel Management System
A dual-platform system designed to streamline hotel operations. It features a robust Java-based dashboard for administrators and a user-friendly web interface for customers to book and manage rooms.

# Requirement
Before you begin, ensure you have the following installed on your system:

Java Runtime Environment (JRE) / JDK

Apache NetBeans (for the Manager Application)

MySQL Workbench 8.0 (for Database Management)

XAMPP (for the Customer Website)

# Step 1: Database Setup
The application requires a MySQL database to store accounts, room details, and bookings.

Open MySQL Workbench and connect to your Local Instance MYSQL80 server.

Go to File -> Open SQL Script.

Select and execute the SQL files in this specific order:

Execute database.sql first (to create the schema).

Execute data.sql second (to populate the initial data/accounts).

Verify that the database is created successfully. You will need an account from this database to log into the manager dashboard.

# Step 2: Running the Manager Application (Java)
This desktop application is used by hotel staff to manage the dashboard.

Open Apache NetBeans.

Go to File -> Open Project and select the Hotel Management System folder.

Configure Database Connection:

Navigate to: Source Packages > db > connectdb.java.

Locate the connection string line (usually near the "root" username).

Change the placeholder password to your MySQL Workbench root password.

Run: Right-click the project and select Run. You can now log in to the dashboard using the credentials set up in Step 1.

# Step 3: Running the Customer Website (PHP)
Customers can browse and assign rooms via the web interface.

Install XAMPP: Ensure XAMPP is installed on your computer.

Deploy Website Files:

Locate the htdocs folder within this repository.

Copy the contents of this folder.

Navigate to your local XAMPP installation directory (usually C:\xampp\htdocs).

Paste the files here, replacing any existing files if necessary.

Configure Database Connection:

In your new htdocs folder, locate the config file (e.g., config.php).

Open it and update the password field with your MySQL Workbench root password.

Launch:

Open the XAMPP Control Panel and click Start next to Apache.

Open your web browser and enter: http://localhost/index.php.

Usage: You can now register a customer account and proceed to assign or book a room.

# Troubleshooting
Connection Errors: Double-check that your MySQL password in connectdb.java and the PHP config file matches your actual MySQL root password.

SQL Errors: Ensure database.sql is run before data.sql to avoid foreign key or table-not-found errors.
