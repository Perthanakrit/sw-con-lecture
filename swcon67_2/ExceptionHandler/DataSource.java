import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataSource {
    public void read(String fileName) {
        FileReader reader = null; // Others throw
        try {
            reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();

            System.out.println("--- last line of try ---");
        }

        catch (FileNotFoundException e) {
//            System.exit(1);
            System.out.println(e.getMessage());
            return;
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        finally {
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            }
//            catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
        finally {
            System.out.println("--- finally clause ---");
        }
        System.out.println(" --- end line of function ---");
    }
}
