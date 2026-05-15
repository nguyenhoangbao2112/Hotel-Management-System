# 🏨 Hotel Management System

A dual-platform hotel management solution built with **Java (Swing)** and **PHP**, backed by a **MySQL** database. The system provides a powerful desktop dashboard for hotel staff and a clean web interface for customers to browse and book rooms.

---

## ✨ Features

### 🖥️ Manager Dashboard (Java Desktop App)
- Secure staff login
- Manage room types, availability, and pricing
- Handle and track bookings in real time
- Manage employee records
- Process and record payments

### 🌐 Customer Website (PHP)
- Customer registration and login
- Browse available rooms
- Book and assign rooms online
- Responsive web interface

---

## 🛠️ Tech Stack

| Layer        | Technology              |
|--------------|-------------------------|
| Desktop App  | Java (Swing), NetBeans  |
| Web Frontend | PHP, HTML, CSS          |
| Database     | MySQL 8.0               |
| Local Server | XAMPP (Apache)          |

---

## 📋 Prerequisites

Before getting started, make sure you have the following installed:

- **JDK** (Java Development Kit)
- **Apache NetBeans** IDE
- **MySQL Workbench 8.0**
- **XAMPP** (with Apache & MySQL)

---

## 🚀 Getting Started

### Step 1 — Database Setup

1. Open **MySQL Workbench** and connect to your local MySQL 8.0 instance.
2. Go to **File → Open SQL Script**.
3. Execute the SQL files **in this exact order**:
   - `Database.sql` — creates the schema and tables
   - `Data.sql` — populates initial data and default accounts
4. Verify the database was created successfully. You will use these credentials to log into the manager dashboard.

> ⚠️ **Important:** Always run `Database.sql` before `Data.sql` to avoid foreign key errors.

---

### Step 2 — Running the Manager Application (Java)

1. Open **Apache NetBeans**.
2. Go to **File → Open Project** and select the `Hotel Management System` folder.
3. Configure the database connection:
   - Navigate to `Source Packages → db → connectdb.java`
   - Find the connection string and update the **password** field with your MySQL root password.
4. Right-click the project and select **Run**.
5. Log in using the credentials set up in Step 1.

---

### Step 3 — Running the Customer Website (PHP)

1. Copy the contents of the `htdocs/` folder from this repository.
2. Paste them into your XAMPP installation directory:
   ```
   C:\xampp\htdocs\
   ```
3. Configure the database connection:
   - Open `htdocs/config.php`
   - Update the **password** field with your MySQL root password.
4. Open the **XAMPP Control Panel** and start **Apache**.
5. Open your browser and navigate to:
   ```
   http://localhost/index.php
   ```
6. Register a customer account and start booking rooms.

---

## 📁 Project Structure

```
Hotel-Management-System/
├── Hotel Management System/     # Java desktop application (NetBeans project)
│   ├── src/                     # Java source files
│   │   ├── Dashboard.java       # Main dashboard UI
│   │   ├── ManageBooking.java   # Booking management
│   │   ├── ManageEmp.java       # Employee management
│   │   ├── Payment.java         # Payment processing
│   │   ├── RoomType.java        # Room type management
│   │   ├── LoginPage.java       # Staff login screen
│   │   └── db/                  # Database connection & operations
│   └── lib/                     # External libraries/dependencies
├── htdocs/                      # PHP web application
│   ├── index.php                # Homepage
│   ├── login.php                # Customer login
│   ├── booking.php              # Booking page
│   ├── roombook.php             # Room assignment
│   ├── config.php               # Database configuration
│   └── css/                     # Stylesheets
├── Database.sql                 # Schema definition
├── Data.sql                     # Seed data & default accounts
└── PDM_Final_Project.pdf        # Project documentation
```

---

## 🔧 Troubleshooting

| Issue | Solution |
|-------|----------|
| **Connection error in Java app** | Verify the password in `connectdb.java` matches your MySQL root password |
| **PHP website can't connect to DB** | Check the password in `htdocs/config.php` |
| **SQL errors on import** | Make sure `Database.sql` is executed before `Data.sql` |
| **Website not loading** | Confirm Apache is running in the XAMPP Control Panel |
| **Login fails** | Re-check that `Data.sql` was executed successfully to populate accounts |

---

## 📄 License

This project was created for academic purposes as part of a final project submission.
