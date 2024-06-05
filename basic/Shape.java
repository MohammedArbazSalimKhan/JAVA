package basic;
import java.util.Scanner;

public class Shape {
    public double area(double r) { 
        double a = 3.14 * r * r;
        return a;
    }

    public int area(int a, int b) { 
        int c = a * b;
        return c;
    }

    public int area(int x) { 
        int z = x * x;
        return z;
    }

    public static void main(String[] args) {
        Shape ss = new Shape();
        Scanner sc = new Scanner(System.in);
        int x, y, P; 
        double r;
        System.out.println("Enter radius, length, breadth, side");
        r = sc.nextDouble(); 
        x = sc.nextInt(); 
        y = sc.nextInt(); 
        P = sc.nextInt(); 

     
        System.out.println("Area of circle is " + ss.area(r));
        System.out.println("Area of rectangle is " + ss.area(x, y));
        System.out.println("Area of square is " + ss.area(P));

        sc.close();
    }
}
