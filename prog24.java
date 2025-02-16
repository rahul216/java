// create a user defined package and use it in the program 
// demopackage is created and democlass is inside the demopackage 

import demopackage.democlass;
public class prog24 {
    public static void main(String[] args) {
        democlass a = new democlass();
        a.sum(20,30);
        a.product(10,8);
    }
}
