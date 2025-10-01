public class Main {
    public static void main(String[] args) {
        //Adaptee
        OldPrinter legacyPrinter = new OldPrinter();

        // Adapter
        NewPrinter adapter = new PrinterAdapter(legacyPrinter);

        Document doc = new Document("Hello World!");

        adapter.printDocument(doc);
    }
}
