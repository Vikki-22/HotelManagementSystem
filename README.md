 Hotel Management System 🏨

A comprehensive and modular **Hotel Management System** developed using **Java (JDK 21), JDBC, and MySQL**.
This project utilizes the **MVC (Model-View-Controller)** architecture to efficiently handle core hospitality workflows like room booking, customer check-ins, staff management, and billing through a clean console-based interface.

---

 ✨ Features

* **Customer Management:** Register and maintain complete details of hotel guests.
* **Room Management:** Track room availability, types (AC, Non-AC, Deluxe), and pricing.
* **Reservation System:** Book and manage room reservations, check-in, and check-out tracking.
* **Staff Management:** Oversee hotel employee records, roles, and shifts.
* **Payment Processing:** Handle billing and record transaction modes and statuses.

---

 🛠️ Tech Used

* **Core Java** (JavaSE-21)
* **JDBC** (Java Database Connectivity)
* **MySQL** Database
* **Eclipse / Spring Tool Suite (STS)**

---

 📌 Concepts Covered

* **MVC Design Pattern** (Separation of Controller, Entity, DAO, and View)
* **DAO (Data Access Object) Pattern** for seamless CRUD operations
* **Object-Oriented Programming (OOPs)**
* **Database Relationships & Integrity** (Foreign keys for linking Reservations and Payments)

---

 📁 Project Structure

* **Controller:** Directs application traffic and processes business rules (`CustomerController`, `RoomController`, etc.).
* **Entity:** POJO data models representing hotel database schemas.
* **Main:** Entry point of the application containing `Main.java` and `MainView.java`.
* **ModelDAO:** Database interaction logic and connection utility (`DBUtil.java`).
* **View:** UI screens and console forms for user interaction.

---

 🚀 MYSQL Schemas and Connectivity(one table to another table)

<img width="1078" height="858" alt="HotelRrservationSystem" src="https://github.com/user-attachments/assets/f012af55-2f79-4556-8159-644a93a6bc86" />


---

 🚀 Run Project

1. **Configure Database:** Run your hotel management SQL script in MySQL to create necessary tables.
2. **Add Driver:** Link the MySQL JDBC Connector jar to your project's **Referenced Libraries**.
3. **Run Application:** Execute `Main.java` inside the `Main` package to launch the system.

---

 👨‍💻 Author

 **Vikki Chandrawanshi**
