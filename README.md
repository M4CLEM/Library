## About This Project
The Library Reservation System is designed to simplify the process of reserving library resources such as books, study rooms, and multimedia materials. It enables library users to easily search for available resources, make reservations, manage their bookings, and receive notifications for important updates. The system aims to enhance the overall user experience and streamline the library resource utilization process.

## System Requirements
Before using the Library Reservation System, ensure that your computer or device meets the minimum hardware and software requirements. This section lists the necessary specifications.

#### Minimum
Operating System: Windows 10 or later \
Processor: Intel Core i3 or better \
Memory: 2GB RAM \
Additional Software: Java Runtime Environment (JRE) version 8 or higher, MySQL Version 8.0.32 or higher

#### Recommended
Operating System: Windows 10 or later \
Processor: Intel Core i5 or better \
Memory: 4GB RAM \
Additional Software: Java Runtime Environment (JRE) version 8 or higher, MySQL Version 8.0.32 or higher

## Installation
1. Install MySQL from `https://dev.mysql.com/downloads/installer/` and choose `(mysql-installer-community-8.0.32.0.msi)` or later
2. Choose all the default options in the configuration of MySQL and make sure to remember the root password.
3. Search and Run the `MySQL 8.0 Command Line Client` application and enter the root password you have set in the configuration earlier.
4. Run this command in the SQL Command line `CREATE DATABASE library;` without the quotation marks then exit.
5. Download the system at `https://github.com/M4CLEM/Library/releases`
6. Download `Library-Reservation-System.zip`.
7. Extract the `Library-Reservation-System` folder from the zip file.
8. Go into `MySQL 8.0 Command Line Client` again and run `CONNECT library;` then run `source <path>` where `<path>` is the absolute path to the library.sql in the `Library-Reservation-System` folder. \
Example: `source C:/Documents/Library-Reservation-System/library.sql`
9. Run the `Library.jar` in the `Library-Reservation-System` folder.

