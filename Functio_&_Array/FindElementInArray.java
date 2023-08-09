import java.util.*;

public class FindElementInArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == d)
                idx = i;
            break;
        }
        System.out.println(idx);
    }
}
