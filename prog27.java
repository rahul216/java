// write a program to demonstrate multthreading in java using a thread class 
class a extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}
class b extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread B: " + i);
        }
    }
}

public class prog27 {
    public static void main(String[] args) {
        a t1 = new a(); 
        b t2 = new b(); 
        t1.start();
        t2.start();
    }
}
