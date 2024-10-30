# Bank-Class
This project is a simple banking application that models a checking account and its transactions using inheritance and polymorphism. 
The Account class serves as the base, containing a Name (account owner's name) and Blance (current account balance), both accessible through getter methods. 
The Checking class extends Account by adding TotalService Charge to track fees and TransList to hold a list of transactions, allowing for various operations on the account.
A general Transaction class serves as a foundation for specific transaction types.

The Check class represents check transactions, each with a unique Check Number entered during input and shown in transaction listings. 
The Deposit class models deposits with separate cash Amount and check Amount values, collected via a dedicated deposit input screen and combined to form the total deposit amount. 
This structure allows easy extension, with each transaction and account class inheriting from base types for efficient handling and reporting of account activities. 

To use, clone the repository, compile the classes, and run the application to manage accounts, enter transactions, and generate reports.
