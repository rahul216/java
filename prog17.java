//  Wap to create a class volume that will calculate volume of geometrical figures using constructor overloading (cube, cuboid, sphere).
class volume {
    private double vol;

    // constructor for cube/cuboid 
    public volume(double length, double radius, double height){
        this.vol = length * radius * height;
    }
// constructor for sphere 
    public volume (double radius){
        this.vol = (4/3)* 3.14 * radius * radius * radius;
    }
// constructor for cylinder 
public volume(double height, double radius){
    this.vol = 3.14 * radius * radius * height;
}
// function to display volume 
public void displayvol(){
    System.out.println("Volume of the figure is: " + vol);
 
}
}


public class prog17 {
    public static void main(String[] args) {
        volume cuboid = new volume(4,5,6);
        cuboid.displayvol();

        volume sphere = new volume(7);
        sphere.displayvol();

        volume cylinder = new volume(8,9);
        cylinder.displayvol();
    }
}
