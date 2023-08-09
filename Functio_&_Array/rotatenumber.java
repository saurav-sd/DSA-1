import java.util.*;

public class rotatenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int d = 0;
        for (int i = n; i != 0; i /= 10) {
            d++;
        }

        k = ((k % d) + d) % d;

        int a = n % (int) Math.pow(10, k);
        int b = n / (int) Math.pow(10, k);
        int res = a * (int) Math.pow(10, d - k) + b;
        
        System.out.println(res);

    }
}
