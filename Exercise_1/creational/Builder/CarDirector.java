public class CarDirector {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8 Engine");
        builder.setGPS(true);
    }

}
