public class Scanner {
    private CashRegister cashRegister = new CashRegister();
    public void scannedBarcode(int barcode) {
        cashRegister.setCurrentProductUPC(barcode);
    }
}

