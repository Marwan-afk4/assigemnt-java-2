
package inhertance;
import java.util.Scanner;
public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        Scanner input = new Scanner (System.in);
        System.out.println("enter the radios you want ");
        int radius=input.nextInt();
        double pi=3.14;
        double area=Math.PI * radius * radius;
        System.out.println("area = "+ area);
        return 0;
    }

    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }    
}

