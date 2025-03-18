//Q30
class MyException extends Exception{
    MyException(String s)
    {
        super(s);
    }
}
public class except4 {
    public static void main(String[] args) {
        int a,b,c;
        a=10;b=15;
        try{
            c=a/b;
            if(c<1){
                throw new MyException("Number is very small");
            }}
            catch(MyException e){
                    System.out.println(e.getMessage());
                    }
                        System.out.println("End of Program");
        }
    }

