public class IndianMenuFactory implements MenuFactory{
     public Drink createDrink() {
        return new IndianDrink();
    }
    public MainCourse createMainCourse() {
        return new IndianMainCourse();
    }
    public Dessert createDessert() {
        return new IndianDessert();
    }
}
