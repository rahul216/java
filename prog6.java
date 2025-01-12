// write a program to display a reverse of number
import java.util.Scanner;
public class prog6 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number you want to reverse: ");
    int num = input.nextInt();
    input.close();    
    int reverse = 0;
    while( num !=0){
        int digit = num%10; 
        reverse = reverse*10 + digit;
        num = num/10; 
    }
    System.out.println("the reversed number is "+ reverse);
    }
}
