package RestaurantInfo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RestaurantReader {
    public static void main(String[] args) {
        String filename = "files/restaurant.txt";

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ( (line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                String type = data[1].trim();
                String location = data[2].trim();
                double rating = Double.parseDouble(data[3].trim());

                Restaurant restaurant = new Restaurant(name, type, location);
                restaurant.setRating(rating);
                System.out.println(restaurant);
            }


        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        } catch (IOException e) {
            System.err.println("Input stream error");
        }
    }
}
