//wap to display the voulme of cube, cuboid, sphere using thod overloading in java using method overloading
package basic;


import java.util.Scanner;
import java.util.*;

public class VolumeShape {
    public double volumeCube(double r) { 
        double a = r * r * r;
        return a;
    }

    public int volumeCuboid(int a, int b, int c) { 
        int z = a * b* c ;
        return z;
    }

    public double volumeSphere(int x) { 
        double sp = 4/3 *3.14*x * x*x;
        return sp;
    }

    public static void main(String[] args) {
        VolumeShape ss = new VolumeShape();
        Scanner sc = new Scanner(System.in);
        int x, y, P,h; 
        double r;
        System.out.println("Enter radius, length, breadth,height,  side");
        r = sc.nextDouble(); 
        x = sc.nextInt(); 
        y = sc.nextInt(); 
        h = sc.nextInt();
        P = sc.nextInt();

     
        System.out.println("Area of circle is " + ss.volumeCube(r));
        System.out.println("Area of rectangle is " + ss.volumeCuboid(x, y, h));
        System.out.println("Area of square is " + ss.volumeSphere(P));

        sc.close();
    }
}
