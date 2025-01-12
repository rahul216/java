// write a program to initialize the three numbers and calculate the average and print grades
// provided as follows: 
//  avg >80 distinction ,  avg >=60 and avg<80 first , Avg>=50 and <60 second, Avg<50 fail

import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
    // taking the input 
        Scanner input = new Scanner(System.in);
        System.out.println("enter the marks for first subject: ");
        int sub1 = input.nextInt();
        System.out.println("enter marks for second subject: ");
        int sub2 = input.nextInt();
        System.out.println("enter the marks for third sbject: ");
        int sub3 = input.nextInt();
        input.close();

        // cacluating the average and printing the grades 
    float avg = (sub1 + sub2 +sub3)/3 ; 
    System.out.println("the average marks are " + avg);
    if(avg>80){
        System.out.println("the grade is Distinction");
    }
    else if(avg <80 && avg >=60){
        System.out.println("the grade is First");
    }
    else if( avg<60 && avg>= 50){
        System.out.println("the grade is Second");
    }
    else{
        System.out.println("the grade is Fail");
    }

    }
}
