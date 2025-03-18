import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {3, 5, 6, 8, 43, 56, 78, 12, 5, 67, 79};
        System.out.println("Welcome to array search");
        System.out.println("Enter the number you want to search:");
        int num = input.nextInt();

        if (isFound(arr, num)) {  
            System.out.println("Your number was found in the array.");
        } else {
            System.out.println("Your number was not found in the array.");
        }
        
        input.close(); 
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++; 
        }
        return false;
    }
}
