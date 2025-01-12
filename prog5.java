import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        if (num < 2) {
            System.out.println("Number is not valid and is not a prime number");
        } else if (num == 2) {
            System.out.println("The number is a prime number");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    System.out.println("The number is not a prime number");
                    break;
                }
            }

            // If no divisors were found, the number is prime
            if (isPrime) {
                System.out.println("The number is a prime number");
            }
        }
    }
}
