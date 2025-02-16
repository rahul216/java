// write a program to calculate area of various shapes using the concept of interface 
interface shape{
    double  area();
}

class circle implements shape {
    private double radius;

    public circle(double radius ){
        this.radius = radius;
    }
    public double area(){
        return 3.14 * radius * radius;
    }
}

class rectangle implements shape {
    private double length;
    private double width ; 

    public rectangle(double length , double width ){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;    }
}


public class prog26 {
    public static void main(String[] args) {
        shape a = new circle(5);
        shape b = new rectangle(4,6); 
        System.out.println("Area of circle: " + a.area());
        System.out.println("Area of rectangle: " + b.area());
    }
}
