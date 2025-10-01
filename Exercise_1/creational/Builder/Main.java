public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        // Build a Sports Car
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car sportsCar = carBuilder.Build();
        System.out.println("\nBuilt Car: " + sportsCar);
        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual sportsCarManual = manualBuilder.Build();
        System.out.println("\nCar Manual:\n" + sportsCarManual);
    }

}
