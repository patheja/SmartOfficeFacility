public class ManualBuilder implements Builder{
    private Manual manual;

    public ManualBuilder() {
        reset();
    }

    public void reset() {
        manual = new Manual();
    }

    public void setSeats(int number) {
        manual.add("This car has " + number + " seats.");
    }

    public void setEngine(String engine) {
        manual.add("Engine model: " + engine);
    }

    public void setGPS(boolean hasGPS) {
        manual.add(hasGPS ? "This car is equipped with GPS." : "No GPS included.");
    }

    public Manual Build() {
        return manual;
    }
}
