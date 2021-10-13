public class Observer {
    private String _name;
    private float _price;
    private int UPC;

    public Observer(String name, float price, int barcode){
        _name = name;
        _price = price;
        UPC = barcode;
    }
    public String toString() {
        return " | name=" + _name + " | price=" + _price + " | Barcode=" + UPC +" |";
    }
}

