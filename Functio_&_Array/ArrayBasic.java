import java.util.*;

public class ArrayBasic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // DECLARATION & INITIALISATION
        int[] nums = new int[n];
        System.out.println(nums); // will print the refrence of an array.
        System.out.println(Arrays.toString(nums)); // default or empty array of n size.

        // RANDOM ACCESS
        for (int idx = 0; idx < nums.length; idx++) {
            nums[idx] = idx + 1;
        }

        for (int idx = 0; idx < nums.length; idx++) {
            System.out.print(nums[idx] + " ");
        }
    }
}
