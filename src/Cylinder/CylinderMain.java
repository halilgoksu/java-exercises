//Write an app that generates a random integer radius (r) and
//height (h) for a cylinder in the range 1 to 10, inclusive, and
//then computes the volume and surface area of the cylinder


package Cylinder;

import java.util.Random;

public class CylinderMain {
    public static void main(String[] args) {
        Random rand=new Random();

        int r ,h;
        double vol,area;
        r=rand.nextInt(10)+1;
        h=rand.nextInt(10)+1;

        vol=Math.PI*Math.pow(r,2)*h;
        area =(2*Math.PI*r*h)+(2 *Math.pow(r,2));
        System.out.println("Random r: "+r);
        System.out.println("Random h: "+h);
        System.out.println("Volume = "+ vol);
        System.out.println("area = "+area);

    }
}
