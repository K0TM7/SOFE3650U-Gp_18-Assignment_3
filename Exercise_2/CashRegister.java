public class CashRegister {
    private Display display = new Display();
    private TicketPrinter ticketPrinter = new TicketPrinter();
    private int UPC;

    public void setCurrentProductUPC(int barcode) {
        UPC = barcode;
        display.displayProduct("Product 1");
        ticketPrinter.displayProduct("Product 1");
    }
}