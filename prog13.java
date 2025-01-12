// write a program to print a pyramid of 1 and 0 only
    
public class prog13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k % 2 == 0? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}
