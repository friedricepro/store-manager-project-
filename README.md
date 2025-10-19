# store-manager-project-
My store manager project for unit 2 CSA

# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

<img width="554" height="444" alt="image" src="https://github.com/user-attachments/assets/861675d9-bfb9-4784-802b-648d0e0c1b31" />

## Description

My project is a store inspired by pokemarts in Pokemon games. I chose this topic because Pokemon is one of my favorite franchises and I felt the most comfortable coding a store with pokemon items because I have played the game and know what to expect. The superclass for the class hiearchy is "Product" which has the instance variables "Double price", "String name", and "String tier". This is the superclass because the other 2 subclasses are products as well, but can inherit the variables and methods of product to save time and reduce lines of code. Each instance variable has a no-argument constructor to add default values, as well as a parameterized constructor to have chosen values when instantiated. The Product superclass also consists of getter methods that return values while keeping the encapsulated values safe from interaction through other classes, while also increasing accesibility by letting other classes use this value without changing it. A setter method is included as well to be able to change the values when needed, and lastly the toString method overrides the original print to produce a clear and concise print statement. The subclasses consisted of "Pokeball" and "HealPotion", both of which inherit from Product (superclass). Each subclass consists of a new instance variable, "double catchRate" for Pokeball, and "int healAmount" for HealPotion. Both also include a no-argument constructor to assign default values, and a parameterized constructor using the keyword "super" to inherit the values "name, price, and tier' from the superclass to set values when instantiated. The two subclasses include getter methods to return values and increase accessability, setter methods to change values, and a toString method to override the original print statement.
