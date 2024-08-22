package RestaurantInfo;

import java.io.*;

public class RestaurantDataWriter {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);

        String fileName = "files/restaurant.txt";
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter printWriter = new PrintWriter(fw);

        System.out.println("Add new restaurant -->");

        System.out.print("name: " );
        String name = buffer.readLine();

        System.out.print("type: " );
        String type = buffer.readLine();

        System.out.print("location: " );
        String location = buffer.readLine();

        Restaurant restaurant = new Restaurant(name, type, location);

        printWriter.println(restaurant);
        printWriter.close();
    }
}
