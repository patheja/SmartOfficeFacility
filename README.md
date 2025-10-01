**EXERCISE 2: 2) Smart Office Facility Programming Exercise**

The Smart Office Facility simulates controlling a smart workplace with meeting rooms.
It allows configuration of rooms, setting maximum capacity, booking, cancelling, tracking occupancy, and managing utilities (AC, lights) automatically.
The system is fully console-based and uses the Command Pattern for flexibility and extensibility.

**Classes**

ConfigRoomCommand → Configure number of rooms in the office

ConfigCapacityCommand → Set maximum capacity for a given room

BookRoomCommand → Reserve a room with a start time and duration

CancelRoomCommand → Cancel a room booking

AddOccupantCommand → Add occupants to a room, triggering AC and lights automatically

RoomStatusCommand → Check current status of a room (occupied/unoccupied, booking info)

RoomSummaryCommand → Print usage statistics of all rooms

Core Components

SmartOfficeCommandCenter → Invoker (Command Pattern)

Room → Receiver (Command Pattern)

OfficeManager → Singleton manager that maintains all rooms

Booking → Represents a room booking with start time and duration

OccupancySensor → Subject in Observer Pattern

ACController / LightController → Observers (automatically switch ON/OFF)