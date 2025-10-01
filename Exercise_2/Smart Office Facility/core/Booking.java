package core;

import java.time.LocalTime;

public class Booking {
    private final LocalTime start;
    private final int durationMinutes;

    public Booking(LocalTime start, int durationMinutes) {
        this.start = start;
        this.durationMinutes = durationMinutes;
    }
    
    public LocalTime getStart() {
        return start;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
}
