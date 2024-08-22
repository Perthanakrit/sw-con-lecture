import java.util.Scanner;

public class If_ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1st number: ");
        int num1 = in.nextInt();
        System.out.print("2nd number: ");
        int num2 = in.nextInt();
        System.out.print("3rd number: ");
        int num3 = in.nextInt();

        int[] nums = {num1, num2, num3};

        // sorting
        for (int i = 0; i < 3; i++ ) {
            boolean swapped = false;
            for (int j = 0; j < 3 - i - 1; j++ ) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        for (int i = 0; i < 3; i++ ) {
            System.out.println((i + 1) + "th number: " + nums[i]);
        }
    }
}
