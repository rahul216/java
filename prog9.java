// Wap to initials a number and display its table in tabular format
import java.util.Scanner;
public class prog9 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int num = input.nextInt();
input.close();
System.out.println("the table of the number "+num +" is");
for( int i =1; i<=10; i++){
    System.out.println(num +" X " + i +" = " + num*i) ;
}

}
    
}
