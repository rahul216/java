// Create a class bank that contains account no. , name, account type(saving, current, fixed), amount as
// data members. Define a constructor to input name, account type and amount as 100(fixed). Define
// two methods, one for deposit and another for withdraw to update the balance amount. Define
// another method to display name, account type and balance.
// the program should run like a menu, means it first provide the choice to user what the users wants to do and then perfrom that action. 

import java.util.Scanner;

class Bank {
    private int accNo;
    private String name;
    private String accType;
    private double amount;

    // constructor 
    Bank(String name , String accType){
        this.name = name;
        this.accType = accType;
        this.amount = 1000;
        this.accNo = (int)(Math.random()*10000000);

    }

    // function to deposit 
    void deposit(double dep){
        amount += dep;
        System.out.println("Amount deposited successfully. New balance: " + amount);
    }

    // function to withdraw 
    void withdraw(double withdrawAmount){
        if(amount >= withdrawAmount){

            amount -= withdrawAmount;
            System.out.println("Amount withdrawn successfully. New balance: " + amount);
        }
        else{
            System.out.println("Insufficient funds.");
        }

    }

    void displayDetails(){
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + amount);
    }
}

public class prog19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter the account type: \n Fixed , Savings , Current ");
        String accType = input.nextLine();

        // creating object 
        Bank account1 = new Bank(name , accType);

        int choice = 0;
        while(choice !=4){
            System.out.println("\n Menu: ");
            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Display details ");
            System.out.println("4. Exit ");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch(choice){
                case 1:
                System.out.println("Enter the amount to deposit ");
                double depAmount = input.nextDouble();
                account1.deposit(depAmount); 
                break;
                case 2:
                System.out.println("Enter the amount to withdraw ");
                double wAmount = input.nextDouble();
                account1.withdraw(wAmount);
                break;
                case 3:
                account1.displayDetails();
                break;
                case 4:
                System.out.println("Exiting the program... ");
                break;
                default: 
                System.out.println("Invalid input, please choose from the given menu.");


            }

        }

    input.close(); 

    }
}
