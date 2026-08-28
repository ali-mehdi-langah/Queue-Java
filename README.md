# Queue-Java

A collection of Java implementations for practicing and understanding the **Queue data structure** using different approaches.

## 📌 About

This repository is created as part of my **Java Data Structures learning journey**. It contains my practice implementations of a **Queue using a Doubly Linked List and an Array**.

The purpose of this repository is to understand how Queue operations work internally and to improve my programming logic, Object-Oriented Programming concepts, and understanding of data structures.

The Queue follows the **FIFO (First In, First Out)** principle, which means the element added first is removed first.

## 🚀 Implementations

### 1. Linked Queue

The `LinkedQueue.java` class implements a Queue using a **circular doubly linked list with a dummy/sentinel head node**.

It uses nodes and references to connect the elements together.

Main operations include:

- Add elements
- Get the first element
- Remove elements
- Check queue size
- Check if the queue is empty
- Calculate the sum of integer elements
- Display elements using `toString()`

### 2. Array Queue

The `ArrayQueue.java` class implements a Queue using an **array**.

The elements are stored inside an array, and the Queue operations are performed using array indexes.

Main operations include:

- Add elements
- Get the first element
- Get the last element
- Remove elements
- Check queue size
- Check if the queue is empty
- Resize the array when required
- Display elements using `toString()`

## 🧠 Concepts Practiced

- Queue
- FIFO (First In, First Out)
- Array-based Queue
- Linked Queue
- Doubly Linked List
- Circular Doubly Linked List
- Nodes
- References
- Arrays
- Array resizing
- Queue operations
- Java Interfaces
- Classes and Objects
- Object-Oriented Programming
- Methods
- Exception Handling
- Sentinel/Dummy Node
- Type Casting
- Data Structure implementation

## 📂 Files

```text
Queue-Java/
│
├── LinkedQueue.java
├── ArrayQueue.java
├── Queue.java
├── ExpensiveTracker.java
└── README.md

📖 About the Files
LinkedQueue.java

Contains the implementation of a Queue using a circular doubly linked list. It uses a dummy head node and maintains references between nodes.

ArrayQueue.java

Contains the implementation of a Queue using an array. It demonstrates how queue elements can be stored and managed using array indexes.

Queue.java

Contains the Queue interface, which defines the operations that Queue implementations can provide.

ExpensiveTracker.java

A practice class used while learning and working with Queue concepts in Java.

🔄 Queue Principle

A Queue follows:

FIFO = First In, First Out

Example:

Add:       10 → 20 → 30 → 40

Remove:   10

After:     20 → 30 → 40

The element that enters first is removed first.

🎯 Purpose

The main purpose of this repository is to:

Understand how Queue works internally
Learn how to implement a Queue using an array
Learn how to implement a Queue using linked nodes
Practice Java interfaces
Improve Object-Oriented Programming skills
Understand references and nodes
Practice exception handling
Improve programming logic
Build a strong foundation in Data Structures and Algorithms
📚 Learning Journey

This repository is part of my ongoing journey of learning Java, Object-Oriented Programming, and Data Structures & Algorithms.

I am building these implementations from scratch to understand how data structures work internally rather than only using Java's built-in collection classes.

👨‍💻 Author

Ali Mehdi

Software Engineering Student