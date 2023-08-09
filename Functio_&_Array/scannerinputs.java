import java.util.*;

public class scannerinputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        double val2 = sc.nextDouble();
        String val3 = sc.next();

        System.out.println("string : " + val3);
        System.out.println("double : " + val2);
        System.out.println("int : " + val1);
    }
}
