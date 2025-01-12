// Wap to create class Area. which will calculate area of geometrical figures using function overloading.
class area {
    // circle area 
    double calcArea(double r){
        return 3.14 * r *r ;
    }
//  rectangle area
    double calcArea(double length, double breadth){
        return length * breadth;
    }

    // triangle area
    double calcArea(double base, double height, boolean triangle){
        if(triangle){
            return 0.5 * base * height;
        }
        return -1; 
    }
}

public class prog15 {
    public static void main(String[] args) {
        area area = new area();
        double circle = area.calcArea(4);
        System.out.println("the area of circle is: " +circle);

        double rectangle = area.calcArea(10, 24);
        System.out.println("the area of rectangle is: " + rectangle);

        double triangle = area.calcArea(10, 24, true);
        System.out.println("the area of triangle is: " + triangle);
    }
}
