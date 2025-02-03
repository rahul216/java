// Create a class student containing name and roll number and two methods to get name and roll 
// and display it also. Create a marks class containig marks, and method to get marks and display it.
//  The marks class should be inherited from student class. Create a derived class bonus having b as 
//  bonus marks and total marks. It have a method to get bonus marks and to display total marks.

class Student {
    private String name;
    private int roll;

    public void getDetails(String name, int roll){
        this.name = name;
        this.roll = roll;

    }
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}

class marks extends Student {
    protected int marks; 

public void getMarks( int marks){
    this.marks = marks;
}    
public void displayMarks(){
    System.out.println("Marks: " + marks);
}

}

class Bonus extends marks{ 
    private int bonus;
    private int total; 

    public void getBonus(int bonus){
        this.bonus = bonus;
    }

    public void displayTotal(){
        total = marks + bonus;
        System.out.println("Bonus marks are: " + bonus);
        System.out.println("Total marks are: " + total);
    }
}
public class prog20 {
    public static void main(String[] args) {
        Bonus s1 = new Bonus();
        s1.getDetails("Rahul bachheti", 133);
        s1.getMarks(90);
        s1.getBonus(7);

        System.out.println("The student details are: ");
        s1.displayDetails();
        System.out.println("The student marks are: ");
        s1.displayMarks();
        s1.displayTotal();
    }
}
