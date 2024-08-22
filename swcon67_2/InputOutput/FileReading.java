import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        String fileName = "files/number.txt";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader buffer = new BufferedReader(fileReader);

            System.out.println("Open file:");
            String line = buffer.readLine();

            int sum = 0;
            while ((line = buffer.readLine()) != null) {
                // If data is number
                System.out.println("-----> " + line);
                int num = Integer.parseInt(line);
                sum += num;
            }
            System.out.println("Sum: " + sum);
        }
        catch (FileNotFoundException e) {
            System.err.println("File " + fileName + " not found");
        }
        catch (IOException e){
            System.err.println("Error reading from file");
        }
    }
}
