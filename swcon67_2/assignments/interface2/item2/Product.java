//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item2;

public class Product {
    private String name;
    private double price; // ราคา
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
