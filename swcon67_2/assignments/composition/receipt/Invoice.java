//ธนกฤต ตระกาจัทร์ 661040206060

package composition.receipt;

import java.util.ArrayList;

public class Invoice {
    private String customerName;
    private String address;
    private ArrayList<Product> products;
    private double grandTotal;

    public Invoice(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotal();
        }
        return total;
    }

    public void printInvoice() {
        System.out.println(String.format("%20s", "INVOICE"));
        System.out.println(customerName);
        System.out.println(address+"\n");

        System.out.printf("%-20s %-10s %-5s %-10s\n", "Description", "Price", "Qty", "Subtotal");
        for (Product product : products) {
            System.out.printf("%-20s %-10.2f %-5d %-10.2f\n",
                    product.getName(), product.getPrice(),
                    product.getQuantity(), product.getTotal());
        }

        System.out.printf("\nTOTAL TO PAY: %.2f\n", calculateTotal());
    }
}
