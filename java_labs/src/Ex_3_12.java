public class Ex_3_12 {
    public static void main(String[] args) {
        Invoice product1 = new Invoice("1", "engine", 10, 15000);
        System.out.println(product1.getPartNumber() + " " + product1.getPartDescription() + " " + product1.getQuantity() + " " + product1.getPricePerItems());
        Invoice product2 = new Invoice("2", "chassis", 10, 8000);
        System.out.println(product2.getPartNumber() + " " + product2.getPartDescription() + " " + product2.getQuantity() + " " + product2.getPricePerItems());

        product1.setPartNumber("6");
        product1.setPartDescription("nsx");
        product1.setQuantity(10);
        product1.setPricePerItems(16000);
        System.out.println(product1.getPartNumber() + " " + product1.getPartDescription() + " " + product1.getQuantity() + " " + product1.getPricePerItems());
        double x = product1.getInvoiceAmount();
        System.out.println(x);

        product2.setPartNumber("8");
        product2.setPartDescription("oil");
        product2.setQuantity(6);
        product2.setPricePerItems(-52);
        System.out.println(product2.getPartNumber() + " " + product2.getPartDescription() + " " + product2.getQuantity() + " " + product2.getPricePerItems());
        double y = product2.getInvoiceAmount();
        System.out.println(y);

    }
}
class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItems;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItems) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0.0) {
            this.quantity = quantity;
        }
        if (pricePerItems > 0.0) {
            this.pricePerItems = pricePerItems;
        }
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItems(double pricePerItems) {
        this.pricePerItems = pricePerItems;
    }

    public double getPricePerItems() {
        return pricePerItems;
    }

    public double getInvoiceAmount() {
        if (quantity < 0) {
            quantity = 0;


        }
        if (pricePerItems < 0) {
            pricePerItems = 0.0;

        }
        return quantity * pricePerItems;
    }

}
