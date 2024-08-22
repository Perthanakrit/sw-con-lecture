package RestaurantInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RestaurantObjReader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "files/restaurant.ser";
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Restaurant art = (Restaurant) ois.readObject();
        Restaurant abby = (Restaurant) ois.readObject();

        System.out.println(art);
        System.out.println(abby);
    }
}
