package singleton;

public class DataController {
    private static DataController instance = new DataController();

    private DataController() {

    }

    public static final  DataController getInstance() {
        return instance;
    }

    public static void goTo(String to) {
        System.out.println(to);
    }
}
