import java.io.*;

public class WriteFile1 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("files/writeTest.txt", true);
        BufferedWriter out = new BufferedWriter(fileWriter);

        String hello = "swaddee";
        String hihi = "ohiyo";

        out.write(hello);
        out.newLine();
        out.write(hihi);
        out.close();
    }
}
