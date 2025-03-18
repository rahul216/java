// check odd even 
import java.util.Scanner ;
public class practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number you want to check...");
        float num = input.nextFloat();
        String result = (num%2 ==0)? "even" : "odd";
       System.out.println(result);
        input.close();
    }

}
