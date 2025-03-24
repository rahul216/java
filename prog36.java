class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

public class prog36 {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 15;

        try {
            c = a / b; // This results in 0 since it's integer division
            if (c < 1) {
                throw new MyException("Number is very small");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End of Program");
    }
}
