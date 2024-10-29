# MetroRail-TicketingSystem-Java 🚆

Welcome to the **MetroRail-TicketingSystem-Java**! This application is designed to simulate a metro rail ticket booking system where users can reserve tickets, select seat types, and view ticket details.

## Project Overview

The MetroRail-TicketingSystem-Java is a console-based Java application that demonstrates object-oriented programming (OOP) concepts. The system allows users to:
- Book train tickets
- Choose between Economy and Business class seats
- Calculate total fare based on ticket quantity and seat type
- Display ticket information

## Features

- **Train Ticket Booking**: Allows users to reserve tickets for metro rail travel.
- **Seat Types**: Users can choose Economy or First-Class for each booking.
- **Fare Calculation**: Calculates the total fare based on seat type and ticket quantity.
- **Display Ticket Details**: Provides a summary of each booking.
- **OOP Principles**: Implements OOP concepts.

## Class Structure

### `MetroRail` Class
This class is the core of the application and contains the following attributes:

- `ticketID`: Unique identifier for the ticket.
- `passengerName`: Name of the passenger.
- `departureStation`: The station from which the journey begins.
- `arrivalStation`: The destination station.
- `seatType`: Type of seat selected (Economy or First-Class).
- `pricePerTicket`: The price per ticket based on seat type.
- `numberOfTickets`: Number of tickets booked.
- `totalFare`: Total fare for the booking.

- ### Methods

1. **Constructor**: Initializes the fields with user-provided data.
2. **Encapsulation**: Ensures data hiding and secure access to ticket information.
3. **totalFare()**: Calculates the total fare based on seat type and quantity.
4. **displayAll()**: Displays ticket details like passenger name, stations, seat type, and total fare.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed (version 8 or higher)
- A Java IDE (like IntelliJ IDEA, Eclipse, or NetBeans) or a terminal to run the application
