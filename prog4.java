// write a program to find smallest of three numbers 
import java.util.Scanner; 
public class prog4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter your third number: ");
        int num3 = input.nextInt();
        input.close();

        if(num1 < num2 && num1 <num3){
            System.out.println("the smallest number is "+ num1);
        }
        else if(num2< num1 && num2 <num3){
            System.out.println("the smallest number is "+ num2);
        }
        else if(num1 == num2 && num1== num3 ){
            System.out.println("All numbers are equal");
        }
        else{
            System.out.println("the smallest number is "+ num3);
        }

    }
}
