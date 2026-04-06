import java.util.*;
class Hypotenuse
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int perpendicular,base;
        double h;
        System.out.println("Enter the perpendicular and base of the right angle triangle");
        perpendicular=in.nextInt();
        base=in.nextInt();
        h=Math.sqrt((Math.pow(perpendicular,2)+Math.pow(2,base)));
        System.out.println("the hypotenuse of the triangle is"+h);
        double Area=(0.5*base)*perpendicular;
        System.out.println("Area of the triangle will be"+Area);
        double perimeter=h+perpendicular+base;
        System.out.println("The Perimeter of the triangle will be"+perimeter);
    }
}
    

   
     
