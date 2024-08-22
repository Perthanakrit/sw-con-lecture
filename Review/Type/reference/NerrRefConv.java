package reference;

import primitiveConverion.WidenAndNarrow;

import java.awt.*;

public class NerrRefConv {
    public static void main(StringEx[] args) {
        Rectangle r1 = new Rectangle();
        Object o1 = r1;
        Rectangle r2 =  (Rectangle) o1;

        Object o2 = new Object();
        Rectangle r3 = new Rectangle();

        System.out.println(r1.hashCode() +" "+ o1.hashCode());

        WidenAndNarrow wan = new WidenAndNarrow();
        System.out.println(wan);
    }
}
