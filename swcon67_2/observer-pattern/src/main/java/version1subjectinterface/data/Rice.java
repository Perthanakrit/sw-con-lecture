package version1subjectinterface.data;

import java.util.ArrayList;
import java.util.List;

public class Rice implements Subject {

    private List<Observer> observers;
    private double price;

    public Rice() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }

    }

    /*
        This method is important
     */
    @Override
    public void notifyObservers(double data) {
        for (Observer o : observers)
            o.update(data);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers(price);
    }

    public double getPrice() {
        return price;
    }

}
