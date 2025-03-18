//Q28
import java.util.Scanner;
public class cdemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Input the number ");
        a=sc.nextByte();
        b=sc.nextByte();
        try{
            c=a/b;
            System.out.println("Result is "+c);
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        catch(Exception e2){
            System.out.println(e2);
        }
        finally{
            System.out.println("This will always be excectued "45);
        }
    }
}
