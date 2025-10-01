public class AbstractFactoryMenuDemo {
    public static void main(String[] args) {
        System.out.println("=== Italian Menu Orders ===");
        Customer italianCustomer = new Customer(new ItalianMenuFactory());
        italianCustomer.orderMainCourse();
        italianCustomer.orderDessert();

        System.out.println("\n=== Indian Menu Orders ===");
        Customer japaneseCustomer = new Customer(new IndianMenuFactory());
        japaneseCustomer.orderDrink();
        japaneseCustomer.orderMainCourse();
    }
}
