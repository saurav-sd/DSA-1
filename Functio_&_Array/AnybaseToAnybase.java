import java.util.Scanner;

public class AnybaseToAnybase {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int c = scn.nextInt();
      int d = anybasetodecimal(n, b);
      int dn = decimaltoanybase(d, c);
      System.out.println(dn);
   }

   public static int anybasetodecimal(int n, int b) {
       int rv = 0;
       int p = 1;
       
       while(n > 0){
           int dig = n % 10;
           n = n /10;
           
           rv += dig * p;
           p = p  * b;
       }
       return rv;
   }
    
   public static int decimaltoanybase(int n, int b) {
        int rv = 0;
       int p = 1;

       while (n > 0) {
           int dig = n % b;
           n = n / b;

           rv += dig * p;
           p = p * 10;
       }
       return rv;
    }
}
