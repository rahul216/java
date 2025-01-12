// write a program to find the largest of two numbers 
import java.util.Scanner;
public class prog2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("enter the second number: ");
        int num2 = input.nextInt();

        if (num1 < num2){
            System.out.println(num2 + " is the largest of two numbers");
        }
        else if(num1> num2){
            System.out.println(num1 +" is the largest of two numbers");
        }
        else{
            System.out.println("both the numbers are same");
        }

        input.close();

    }
}
