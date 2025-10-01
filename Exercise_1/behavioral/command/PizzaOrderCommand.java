public class PizzaOrderCommand implements OrderCommand {
    private Kitchen kitchen;

    public PizzaOrderCommand(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.prepareDish("Pizza");
    }

    @Override
    public void undo() {
        kitchen.cancelDish("Pizza");
    }
}