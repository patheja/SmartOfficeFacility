**Smart Office Facility** 

**EXERCISE 1 - Problem Statement on Design patterns**

Two use cases to demonstrate two behavioural design pattern.

Command

Observer

Two use cases to demonstrate two creational design pattern.

Abstract Factory

Builder

Two use cases to demonstrate two structural design pattern.

Adaptor

Facade

**EXERCISE 2: 2) Smart Office Facility Programming Exercise**

The Smart Office Facility simulates controlling a smart workplace with meeting rooms.
It allows configuration of rooms, setting maximum capacity, booking, cancelling, tracking occupancy, and managing utilities (AC, lights) automatically.
The system is fully console-based and uses the Command Pattern for flexibility and extensibility.

**Classes**

ConfigRoomCommand 

ConfigCapacityCommand 

BookRoomCommand 

CancelRoomCommand 

AddOccupantCommand 

**Core Components**

SmartOfficeCommandCenter → Invoker (Command Pattern)

Room → Receiver (Command Pattern)

OfficeManager → Singleton manager that maintains all rooms

OccupancySensor → Subject in Observer Pattern

ACController / LightController → (Observers)

**Pattern Used:Command pattern, Singleton pattern, Observer Pattern**


    Command Pattern → for encapsulating all console commands

    Singleton → for OfficeManager to ensure one global manager

    Observer Pattern → for AC and Light controllers reacting to room occupancy

**Features**

Configure Office

Booking

Occupancy

**Run Instructions**

Compile all .java files:

        javac Main.java commands/*.java core/*.java utils/*.java

**Run the system:**

        java Main
