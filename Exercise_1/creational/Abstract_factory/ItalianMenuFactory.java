public class ItalianMenuFactory implements MenuFactory{
    public Drink createDrink() {
        return new ItalianDrink();
    }
    public MainCourse createMainCourse() {
        return new ItalianMainCourse();
    }
    public Dessert createDessert() {
        return new ItalianDessert();
    }
}