public class Car {
    private String engine;
    private int seats;
    private boolean hasGPS;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    @Override
    public String toString() {
        return "Car [Engine=" + engine + ", Seats=" + seats + ", GPS=" + hasGPS + "]";
    }
}

