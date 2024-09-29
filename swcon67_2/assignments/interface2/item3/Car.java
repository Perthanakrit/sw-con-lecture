//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item3;

public class Car implements Comparable<Object> {
    private String license;
    private double kiloDriven;

    public Car(String license, double kiloDriven) {
        this.license = license;
        this.kiloDriven = kiloDriven;
    }

    public String getLicense() {
        return license;
    }

    public double getKiloDriven() {
        return kiloDriven;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setKiloDriven(double kiloDriven) {
        this.kiloDriven = kiloDriven;
    }

    @Override
    public int compareTo(Object other) {
        Car o = (Car) other;
        if (this.getKiloDriven() > o.getKiloDriven()) return 1;
        else if (this.getKiloDriven() < o.getKiloDriven()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "license='" + license + '\'' +
                ", kiloDriven=" + kiloDriven +
                '}';
    }
}
