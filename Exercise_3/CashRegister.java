public class CashRegister {
    private Display display = new Display();
    private TicketPrinter ticketPrinter = new TicketPrinter();
    private int UPC;
    private Observer product;
    private ProductDB productDB = new ProductDB();

    public void setCurrentProductUPC(int barcode) {
        UPC = barcode;
        product = getCurrentProductInfo();
        if (product != null){
            display.displayProduct(product.toString());
            ticketPrinter.displayProduct(product.toString());
        }
    }
    public Observer getCurrentProductInfo() {
        product = productDB.GetProductInfo(UPC);
        return product;
    }
}