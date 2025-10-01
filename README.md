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

**Features**

Configure Office

Booking

Occupancy


