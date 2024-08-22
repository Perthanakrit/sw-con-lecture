import java.io.IOException;

public class IO1 {
    public static void main(String[] args) {
        System.out.println("Enter character: ");

        try {
            int inChar = System.in.read();
            System.out.println("inChar = " + inChar);
            char a = (char) inChar;
            System.out.println("You entered " + a);
        }
        catch (IOException ex) {
            System.err.println("Error reading character");
        }
    }
}
