# Assignment 4 - Facade Pattern

## About the Project

This project was created to demonstrate the Facade Design Pattern in Java.

The project represents a simple online order system. When a customer makes an order, the system needs to check the product, process the payment, create a shipment, and send a notification.

## Project Classes

The project contains:

* Main - starts the program.
* OrderFacade - controls the order process.
* InventoryService - manages products.
* PaymentProcessor - processes payments.
* ShippingService - creates shipments.
* NotificationService - sends notifications.

## How It Works

The Main class communicates only with OrderFacade.

The Facade performs all necessary steps:

1. Reserves the product.
2. Processes the payment.
3. Creates the shipment.
4. Sends a notification to the customer.

If the payment fails, the product is returned to the inventory.

## Technologies

* Java
* JDK 17
* IntelliJ IDEA

## Facade Pattern

The main idea of the Facade Pattern is to make a complex system easier to use.

In this project, OrderFacade hides the work of several subsystem classes and provides one simple method for placing an order.
