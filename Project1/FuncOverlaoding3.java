/* Function called area 
 * To find area of a square 
 * To find area of cicle
 * To find area of rectangle 
 */
import java.util.*;
class FuncOverlaoding3
{
    int area(int side)
    {
        int square=side*side;
        return square;
    }
    double area(long radius)    
    {
        double circle=3.14*radius*radius;
        return circle;
    }
    int area(int l,int b)
    {
        int rectangle=l*b;
        return rectangle;
    }
    public static void main(String args[])
    {
        FuncOverlaoding3 ob=new FuncOverlaoding3();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the sides of square ");
        int x=sc.nextInt();
        System.out.println("area of square="+ob.area(x));
        System.out.println("Enter the radius of the circle ");
        long x1=sc.nextLong();
        System.out.println("area of circle="+ob.area(x1));
        System.out.println("Enter the lenth and breath of a rectangle");
        int x2=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("area of square="+ob.area(x2,y));
    }
}
        