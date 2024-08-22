import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOBufferedReader {
    public static void main(String[] args) {
        IOBufferedReader thisClass = new IOBufferedReader();
        try {

            thisClass.oneReading();
        }
        catch (IOException e){
            System.err.println("Error reading from user");
        }
    }

    void oneReading() throws IOException {
        System.out.print("Enter characters: ");
        InputStreamReader inReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inReader);

        String line = buffer.readLine();
        System.out.println("You entered: " + line);
    }

    void loopReading() throws IOException {
        InputStreamReader inReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inReader);

        System.out.println("Enter lines:");
        String line = buffer.readLine();

        while (!line.equals("bye")) {
            System.out.println("-----> " + line);
            line = buffer.readLine();
        }
    }
}
