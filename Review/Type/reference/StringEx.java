package reference;

public class StringEx {
    private String str;
    public StringEx() {
        str = "Hello World!";
    }

    public static void main(String[] args) {
        StringEx s = new StringEx();

        for (int i = 0; i < 3; i++) {
            System.out.println(s.str.charAt(i));
        }
    }
}
