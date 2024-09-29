//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item3;

public class Product implements Comparable<Product> {
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

    @Override
    public int compareTo(Product o) {
       if (this.getPrice() > o.getPrice()) return 1;
       else if (this.getPrice() < o.getPrice()) return -1;
       else return 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
