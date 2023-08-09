import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("inside the main function before call " + a);
        fun(a);
        System.out.println("inside the main function after call " + a);
    }
    
    public static void fun(int b) {
        System.out.println("inside the fun function while entering " + b);
        b++;
        System.out.println("inside the fun function while exiting " + b);
    }
}
