import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        int f = Math.min(a, b);

        while (f > 0) {
            if (a % f == 0 && b % f == 0)
                return f;
            f--;
        }
        return 1; // co-prime
    }
}
