public class Customer {
    private MenuFactory menu;

    public Customer(MenuFactory menu) {
        this.menu = menu;
    }

    public void orderDrink() {
        System.out.println("Customer ordered: " + menu.createDrink().getDrinkItem());
    }

    public void orderMainCourse() {
        System.out.println("Customer ordered: " + menu.createMainCourse().getMainCourseItem());
    }

    public void orderDessert() {
        System.out.println("Customer ordered: " + menu.createDessert().getDessertItem());
    }
}
