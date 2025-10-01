package core;

import java.time.LocalTime;
import utils.SchedulerUtil;

public class Room {
    private final int id;
    private int maxCapacity;
    private boolean occupied = false;
    private int totalOccupantsEntered = 0;  // cumulative occupants
    private int totalBookings = 0;
    private Booking booking;
    private final OccupancySensor sensor;

    public Room(int id) {
        this.id = id;
        sensor = new OccupancySensor();
        sensor.attach(new ACController());
        sensor.attach(new LightController());
    }

    public int getId() { return id; }

    public void setMaxCapacity(int capacity) {
        if (capacity <= 0) {
            System.out.println("Invalid capacity. Please enter a valid positive number.");
            return;
        }
        this.maxCapacity = capacity;
        System.out.println("Room " + id + " maximum capacity set to " + capacity + ".");
    }

    public void book(LocalTime start, int durationMinutes) {
        if (booking != null) {
            System.out.println("Room " + id + " is already booked during this time. Cannot book.");
            return;
        }
        booking = new Booking(start, durationMinutes);
        totalBookings++;
        System.out.println("Room " + id + " booked from " + start + " for " + durationMinutes + " minutes.");

        SchedulerUtil.schedule(() -> {
            if (!occupied && booking != null) {
                booking = null;
                System.out.println("Room " + id + " is now unoccupied. Booking released. AC and lights off.");
            }
        }, 5);
    }

    public void cancelBooking() {
        if (booking != null) {
            booking = null;
            occupied=false;
            System.out.println("Booking for Room " + id + " cancelled successfully.");
        } else {
            System.out.println("Room " + id + " is not booked. Cannot cancel booking.");
        }
    }
    public void printStatus() {
        if (booking == null && !occupied) {
            System.out.println("Room " + id + " is now unoccupied. Booking released. AC and lights off.");
        } else if (booking != null) {
            System.out.println("Room " + id + " is booked from " + bookingStartTime() + " for " + bookingDuration() + " minutes."
                    + (occupied ? " Currently occupied." : " Currently unoccupied."));
        } else if (occupied) {
            System.out.println("Room " + id + " is currently occupied by occupants.");
        } else {
            System.out.println("Room " + id + " is free and unoccupied.");
        }
    }

    // Helper methods to get booking info
    private String bookingStartTime() {
        return booking != null ? booking.getStart().toString() : "N/A";
    }
    private int bookingDuration() {
        return booking != null ? booking.getDurationMinutes() : 0;
    }
    public void setOccupants(int count) {
        if (count < 0) {
            System.out.println("Invalid occupant count.");
            return;
        }
        if (maxCapacity > 0 && count > maxCapacity) {
            System.out.println("Room " + id + " exceeded capacity limit of " + maxCapacity + ".");
            return;
        }
        if (count > 1) totalOccupantsEntered += count;
        if (count == 0) {
            occupied = false;
            System.out.println("Room " + id + " is now unoccupied. AC and lights turned off.");
        } else if (count == 1) {
            occupied = false;
            System.out.println("Room " + id + " occupancy insufficient to mark as occupied.");
        } else {
            occupied = true;
            System.out.println("Room " + id + " is now occupied by " + count + " persons. AC and lights turned on.");
        }
        sensor.notifyObservers(id, occupied, count);
    }
    public void printUsageSummary() {
    System.out.println("Room " + id + " Usage Summary:");
    System.out.println("Total bookings: " + totalBookings);
    System.out.println("Total occupants entered: " + totalOccupantsEntered);
    }
}
