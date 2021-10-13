public class Keyboard {
    private CashRegister cashRegister = new CashRegister();
    public void setBarcode(int barcode){
        cashRegister.setCurrentProductUPC(barcode);
    }
}