//ธนกฤต ตระกาจัทร์ 661040206060

package designPattern.strategy.store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.addProduct("Big Java", 300, 5);
        store.addProduct("Da Vinci Code", 120, 0);
        store.addProduct("Python 101", 200, 10);

        System.out.println(new allProductCouter().countProduct(store.getProducts()));
        System.out.println(new productInStockCounter().countProduct(store.getProducts()));
        System.out.println(new productQuantityCounter().countProduct(store.getProducts()));
    }
}
