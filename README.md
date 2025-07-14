# Library Management System (Java Console Project)

## Description
This is a console-based Library Management System developed using Core Java. The system manages books and members, allowing faculty and students to borrow and return books with limits based on member type.

## Features
- Add and view library books.
- Register student and faculty members.
- Issue and return books with validation.
- Apply borrowing limits based on member type using inheritance.

## Technologies Used
- Java (Core)
- OOP Concepts: Inheritance, Polymorphism, Abstraction, Encapsulation
- Java Collections: ArrayList, HashMap
- Exception Handling

## Project Structure
- `model/` : Contains Book and Member classes
- `service/` : Business logic for managing books and members
- `Main.java` : Entry point to run the application

## How to Run
1. Compile all `.java` files using a Java compiler:
   javac Main.java model/*.java service/*.java

2. Run the application:
   java Main

## Suitable For
- Final Year Students
- Java Core Concepts Demonstration
- Resume Projects
- sample input & output
- --- Library System ---
1. View Books
2. View Members
3. Issue Book
4. Return Book
5. Exit

##option:1
Choice: 1
[Available] B1 - Java Programming
[Available] B2 - Data Structures
##option:2
M1 - Alice (StudentMember)
M2 - Dr. Bob (FacultyMember)
##option:3
Choice: 3
Enter Member ID: M1
Enter Book ID: B1
Book issued successfully.
##option:4
Choice: 4
Enter Member ID: M1
Enter Book ID: B1
Book returned successfully.
##option:5
Choice: 5
Goodbye!



