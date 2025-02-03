import java.util.Scanner;

interface employee {
    void getDetails(Scanner input);
    void displayDetails();
}

class fullTime implements employee {
    private String name;
    private String designation;
    private String joiningDate;
    private double salary;
    private int leaves;

    public void getDetails(Scanner input) {  // Accept Scanner as a parameter
        System.out.println("Enter Full-time employee name");
        name = input.nextLine();
        System.out.println("Enter designation: ");
        designation = input.nextLine();
        System.out.println("Enter joining date: ");
        joiningDate = input.nextLine();
        System.out.println("Enter salary: ");
        salary = input.nextDouble();
        System.out.println("Enter no. of leaves: ");
        leaves = input.nextInt();
        
    }

    public void displayDetails() {
        System.out.println("The full-time employee details are: ");
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Salary: " + salary);
        System.out.println("Number of leaves: " + leaves);
    }
}

class partTime implements employee {
    private String name;
    private String designation;
    private String joiningDate;
    private int practicalHours;
    private int theoryHours;
    private double stipendPractical;
    private double stipendTheory;

    public void getDetails(Scanner input) {  // Accept Scanner as a parameter
        System.out.println("Enter Part-time employee name");
        name = input.nextLine();
        System.out.println("Enter designation: ");
        designation = input.nextLine();
        System.out.println("Enter joining date: ");
        joiningDate = input.nextLine();

        while (true) {
            System.out.println("Enter practical hours: ");
            practicalHours = input.nextInt();
            if (practicalHours % 2 != 0) {
                System.out.println("Error: Practical hours should be even");
            } else {
                break;
            }
        }
        stipendPractical = practicalHours * 1000;

        System.out.println("Enter theory hours: ");
        theoryHours = input.nextInt();
        
        stipendTheory = theoryHours * 800;
    }

    public void displayDetails() {
        System.out.println("The part-time employee details are: ");
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Practical hours: " + practicalHours);
        System.out.println("Stipend Practical: " + stipendPractical);
        System.out.println("Theory hours: " + theoryHours);
        System.out.println("Stipend Theory: " + stipendTheory);
    }
}

public class prog21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a single Scanner instance

        employee e1 = new fullTime();
        System.out.println("Enter details for full-time employee: ");
        e1.getDetails(input);  // Pass Scanner to function

        employee e2 = new partTime();
        System.out.println("Enter details for part-time employee: ");
        e2.getDetails(input);  // Pass Scanner to function

        System.out.println("Full-time employee details: ");
        e1.displayDetails();

        System.out.println("Part-time employee details: ");
        e2.displayDetails();

        input.close();  // Close Scanner at the end of the program
    }
}
