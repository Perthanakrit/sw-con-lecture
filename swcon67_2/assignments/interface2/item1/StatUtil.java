//ธนกฤต ตระกาจัทร์ 661040206060

package interface2.item1;

import java.util.ArrayList;

public class StatUtil {
    public static double max(ArrayList<Thing> things) {
        double max = 0;

        for (Thing thing : things) {
            if (thing.getValue() > max) {
                max = thing.getValue();
            }
        }

        return max;
    }
}
