public class CoffeeMachineFacade {
    private WaterHeater heater = new WaterHeater();
    private CoffeeGrinder grinder = new CoffeeGrinder();
    private CoffeeBrewer brewer = new CoffeeBrewer();
    private MilkFrother milkFrother = new MilkFrother();
    private SugarDispenser sugarDispenser = new SugarDispenser();

    public void makeCoffee(String type) {
        heater.heatWater();
        grinder.grindBeans();
        brewer.brew();

        if(type.equalsIgnoreCase("Latte") || type.equalsIgnoreCase("Cappuccino")) {
            milkFrother.addMilk();
        }
        if(!type.equalsIgnoreCase("Black")) {
            sugarDispenser.addSugar();
        }

        System.out.println(type + " is ready!");
    }
}