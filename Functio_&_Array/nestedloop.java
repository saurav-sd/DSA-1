public class nestedloop {
    public static void main(String[] args) {
        
        System.out.println("before outer loop");
        for (int r = 1; r <= 3; r++) {
            System.out.print(r + " -> ");
            for (int c = 1; c <= 4; c++) {
                System.out.print(c + ", ");
            }
            System.out.println();
        }
        System.out.println("after outer loop");
    }
}
