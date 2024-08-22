import RestaurantInfo.Restaurant;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObj {
    public static void main(String[] args) {
        Restaurant kai = new Restaurant("KAI", "Fired chicken", "KU");
        Restaurant abby = new Restaurant("ABBY", "Fired chicken", "KU");

        ObjectOutputStream oos = null;
        String filePath = "files/restaurant.ser";
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(kai);
            oos.writeObject(abby);
            System.out.println("Write object to file success");
        } catch (Exception e) {
            System.err.println("Write object to file failed");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception e) {
                System.err.println("Error closing file");
            }
        }

    }
}
