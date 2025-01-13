// reate a class emp that contains emp no,name, basic, DA,HRA, total as data member.  
// Create a constructor to input a value of emp no, name and basic and another method to calculate da
//  (40 % of basic) and hra (20% basic) and total and display them with employee name and basic 
class emp{
    private int empNo;
    private String name;
    private double basic;
    private double da;
    private double hra;
    private double total;

    // initialising constructor
    public emp(int empNo, String name, double basic){
        this.empNo = empNo;
        this.name = name;
        this.basic = basic;

    }
    // function to calculate DA , HRA and total 

    void calculate(){
        this.da = 0.40 * basic;
        this.hra = 0.20 * basic;
        this.total = basic + da + hra;


    }
    // function to display employee details
    void display(){
        System.out.println("Employee No: " + empNo);
        System.out.println("Name: " + name);
        System.out.println("Basic: " + basic);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("Total: " + total+"\n");
    }


}
public class prog18 {
    public static void main(String[] args) {
        
        emp employee1 = new emp(001, "rahul", 70000);
        employee1.calculate();
        employee1.display();

        emp employee2 = new emp(002, "akhand", 40000);
        employee2.calculate();
        employee2.display();
    }
}
