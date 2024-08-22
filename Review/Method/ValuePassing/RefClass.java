package ValuePassing;

public class RefClass {
    private int x;
    public int y;

    public RefClass() {}

    public RefClass(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
