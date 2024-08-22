package RestaurantInfo;

import java.io.Serializable;

/**
 * This is a restaurant class
 * @author  Me
 * @since project 0.0.1
 */
public class Restaurant implements Serializable {
    //private static final long serialVersionUID = -184177812057888723L;;;

    private String name;
    private String type;
    private String location;
    private double rating;
    //private Address address;

    /**
     * This is constructor
     * @param name
     * @param type
     * @param location
     */
    public Restaurant(String name, String type, String location)  {
        this.name = name;
        this.type = type;
        this.location = location;
        this.rating = 0.0;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + ", " + type + ", " + location + ", " + rating;
    }
}
