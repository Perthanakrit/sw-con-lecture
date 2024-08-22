package ValuePassing;

public class PassBy {
    public static void main(String[] args) {
        PassBy pb = new PassBy();

//        int x=5, y=6;
//        String str = "Hello";
//        pb.byRef(str);
//        System.out.println(str);

        RefClass refClass = new RefClass();
        refClass.setX(1);
        refClass.y = 10;
        pb.byRef(refClass);
        System.out.println(refClass.getX()+" "+refClass.y);

    }

    public void byRef(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public void byRef(String ref) {
        ref = "Reference: " + ref;
    }

    public void byRef(RefClass refClass) {
        int temp = refClass.getX();
        refClass.setX(refClass.y);
        refClass.y = temp;
    }

}
