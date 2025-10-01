public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();

        OrderCommand pizzaOrder = new PizzaOrderCommand(kitchen);
        OrderCommand burgerOrder = new BurgerOrderCommand(kitchen);

        waiter.takeOrder(pizzaOrder);
        waiter.takeOrder(burgerOrder);

        System.out.println("\nUndo last order:");
        waiter.undoLastOrder();
    }
}
