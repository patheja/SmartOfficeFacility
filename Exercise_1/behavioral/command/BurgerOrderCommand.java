public class BurgerOrderCommand implements OrderCommand {
    private Kitchen kitchen;

    public BurgerOrderCommand(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.prepareDish("Burger");
    }

    @Override
    public void undo() {
        kitchen.cancelDish("Burger");
    }
}