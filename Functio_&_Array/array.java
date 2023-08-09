import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] marks = new int[5];
        String[] cricketer = new String[3];
        System.out.println(marks[1]); // default value of array.

        // marks[0] = 84;
        // marks[1] = 50;
        // marks[3] = 90;

        //taking input using loop.
        for (int i = 0; i < cricketer.length; i++) {
            //marks[i] = sc.nextInt();
            cricketer[i] = sc.next();
        }

        for (int i = 0; i < cricketer.length; i++) {
            //System.out.println(marks[i] + " ");
            System.out.println(cricketer[i] + " ");
        }
        
        //System.out.println(marks[1]);
    }
}