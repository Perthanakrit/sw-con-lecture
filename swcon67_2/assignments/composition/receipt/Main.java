//ธนกฤต ตระกาจัทร์ 661040206060

package composition.receipt;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Sam's Small Appliances", "100 Main Street\nAnytown, CA 98765");

        invoice.addProduct(new Product("Toaster", 29.95, 3));
        invoice.addProduct(new Product("Hair dryer", 24.95, 1));
        invoice.addProduct(new Product("Car vacuum", 19.99, 2));

        invoice.printInvoice();
    }
}
