//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item4;

public class Car {
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
    public String toString() {
        return "Car{" +
                "license='" + license + '\'' +
                ", kiloDriven=" + kiloDriven +
                '}';
    }
}