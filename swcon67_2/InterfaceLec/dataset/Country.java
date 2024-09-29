package dataset;

import communication.Messenger;

public class Country implements Measurable {
    private String name;
    private double population;
    private double area;
    private double gdp;

    public Country(String name, double population, double area, double gdp) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.gdp = gdp;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double getMeasure() {
        return getArea();
    }
}
