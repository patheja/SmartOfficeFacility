public class PrinterAdapter implements NewPrinter{
     private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void printDocument(Document doc) {
        // Convert Document → String for the old printer
        oldPrinter.printText(doc.getContent());
    }
}
