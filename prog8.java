// write a program to enter a number and display its factorial. 
import java.util.Scanner;
public class prog8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer to calculate its factorial: ");
        int number = input.nextInt();
        input.close();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorial = 1; 
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

    System.out.println("The factorial of " + number + " is: " + factorial);
    }
    
}
