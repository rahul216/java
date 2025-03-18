//Q27
public class cdemo {
    public static void main(String[] args) {
        int a,b,c;
        a=10;b=0;
        try{
        c=a/b;
            System.out.println("output is "+c); 
    }
        catch(ArithmeticException e){
            System.out.println("Error is "+e);
        }
}}
