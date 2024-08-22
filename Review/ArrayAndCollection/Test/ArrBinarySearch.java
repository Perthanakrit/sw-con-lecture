package Test;

import java.util.Arrays;

public class ArrBinarySearch {
    public static void main(String[] args) {
        int [] arrint = {5,3,1,7};
        Arrays.sort(arrint);
        System.out.println(Arrays.toString(arrint));
        System.out.println(Arrays.binarySearch(arrint,7));
        System.out.println(Arrays.binarySearch(arrint,6));
        System.out.println(Arrays.toString(arrint));
        System.out.println(Arrays.binarySearch(arrint,5));
        System.out.println(Arrays.binarySearch(arrint,3));
        System.out.println(Arrays.binarySearch(arrint,2));
    }
}
