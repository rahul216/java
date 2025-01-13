// Wap to create a class volume that will calculate volume of geometrical figures using function overloading (cube, cuboid, sphere).
class volume {
    // volume of cube/ cuboid 
    double calcVol(double length, double breadth , double height){
        return length * height * breadth;
    }

    // volume of sphere 
    double calcVol(double radius){
        return (4/3) * 3.14 * radius * radius * radius;
    }

    // volume of cylinder 
    double calcVol(double radius, double height ){
        return 3.14 * radius * radius * height;
    }
}
public class prog16 {
    public static void main(String[] args) {
        volume vol = new volume();
        double cuboid = vol.calcVol(10,12,14);
        System.out.println("the volume of cuboid is: "+ cuboid);

        double sphere = vol.calcVol(7);
        System.out.println("the volume of sphere is: "+ sphere);

        double cylinder = vol.calcVol(5, 10);
        System.out.println("the volume of cylinder is: "+ cylinder);
    }
}
