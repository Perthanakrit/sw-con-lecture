public class NonSblock {
    static int i;
    {
        System.out.println("Call non-static block");
        i = 1;
    } // ทำงานทุกครั้งที่มีการสร้าง object ก่อน constructor

    public NonSblock(int i) {
        System.out.println("Call constructor");
        NonSblock.i = i;
    }

    public static void main(String[] args) {
        System.out.println(NonSblock.i);
        NonSblock o = new NonSblock(2);
        System.out.println(NonSblock.i);
        o = new NonSblock(3);
        System.out.println(NonSblock.i);
    }
}
