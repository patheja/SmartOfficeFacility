public class Main {
    public static void main(String[] args) {
        CoffeeMachineFacade coffeeMachine = new CoffeeMachineFacade();
        //normal Coffee
        coffeeMachine.makeCoffee("Latte");
        System.out.println();
        //Black Coffee
        coffeeMachine.makeCoffee("Black");
    }
}
