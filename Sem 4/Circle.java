/*Create a “circle” class & a “point” class. 
The coordinates of the circle are given and used within the “circle” class as object of the “point” class.
 Display the radius and point (x,y)  of the circle along with the area of the circle. */
import java.util.Scanner;
// Point class to handle coordinates
class Point {
    double x, y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
class Circle {
    Point center;
    double radius;
    Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Center Point (x,y): " + center);
        System.out.printf("Area of Circle: %.2f\n", calculateArea());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter Y coordinate: ");
        double y = sc.nextDouble();
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        Circle myCircle = new Circle(x, y, radius);
        myCircle.display();
        sc.close();
    }
}