import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        int[] temp = arr; // stores only refrence
        System.out.println(temp);

        temp[0] = 100;
        temp[1] = 200;
        temp[2] = 300;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
    }
}
