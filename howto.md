# Motor Part Shop System

## Project Description
This project is a Java Object-Oriented Programming (OOP) system designed to simulate a Motor Part Shop.

The system allows customers to:
- Enter their details
- Purchase motor parts
- Make payments using M-Pesa
- View transaction information

The project demonstrates several OOP concepts including:
- Encapsulation
- Inheritance
- Abstract Classes
- Interfaces
- Method Overriding
- Constructors

The program was enhanced to allow dynamic user input and exception handling.

## Exceptions Implemented

The system uses try, catch, and finally blocks to handle errors.

Example handled exceptions include:

1. Invalid payment amount input.
   If the user enters text instead of a number, the program catches the error and displays a message.

2. General input errors.
   The program prevents crashing when unexpected input is entered.

Example code:

try {
    double amount = scanner.nextDouble();
} catch (Exception e) {
    System.out.println("Invalid input entered.");
} finally {
    scanner.close();
}

## Technologies Used
- Java
- Object-Oriented Programming

## Files Included

User.java  
Customer.java  
MotorshopServices.java  
Payment.java  
MpesaPayment.java  
MotorPartSystem.java  
Main.java
