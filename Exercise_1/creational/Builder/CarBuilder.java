public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        reset();
    }

    public void reset() {
        car = new Car();
    }

    public void setSeats(int number) {
        car.setSeats(number);
    }

    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    public void setGPS(boolean hasGPS) {
        car.setHasGPS(hasGPS);
    }

    public Car Build() {
        return car;
    }
}
