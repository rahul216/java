class Student {
    String name;
    int age;

    // 1. Default Constructor
    Student() {
        this.name = "Unknown";
        this.age = 18;
        System.out.println("Default Constructor Called");
    }

    // 2. Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    // 3. Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        System.out.println("Copy Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();                  // Default Constructor
        Student s2 = new Student("Rahul", 21);       // Parameterized Constructor
        Student s3 = new Student(s2);                // Copy Constructor

        s1.display();
        s2.display();
        s3.display();
    }
}
