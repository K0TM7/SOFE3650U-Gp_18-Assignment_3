public class ProductDB {
    String[] product1 = {"21445", "BMW", "45989.99"};
    Observer info = null;
    public Observer GetProductInfo(int barcode){
        int UPC = Integer.parseInt(product1[0]);
        String name = product1[1];
        float price = Float.parseFloat(product1[2]);
        if (UPC == barcode) {
            info = new Observer (name ,price,UPC);
        }
        return info;
    }
}