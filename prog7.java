// write a program to display hailstone series of a number 
import java.util.Scanner;
public class prog7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the number: ");
        int num = input.nextInt();
        input.close();

        if(num <=0){
            System.out.println("Enter a positive integer");
        }
        System.out.println("The Hailstone series for "+num+" is:");

        while(num !=1){
            System.out.print(num + " ");
            if( num%2 ==0){
                num /= 2;
            }
            else{
                num = 3*num +1;
            }
        }
        System.out.println(num);
    }
}
