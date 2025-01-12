// write a program to print pascal's triangle 

public class prog14 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // Print leading spaces for formatting
            for (int j = 0; j <= n - row; j++) {
                System.out.print(" ");
            }
 
            int C = 1; // Initialize C (combination) value for the first element in the row
            // Loop to calculate and print values in the current row
            for (int i = 1; i <= row; i++) {
                System.out.print(C + " "); // Print the current value
                C = C * (row - i) / i; // Calculate the next value using the formula
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
