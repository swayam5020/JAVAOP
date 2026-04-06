import java.util.*;
class Voloverloading
{
    double volume(int radius)
    {
        double sphere=1.3*3.14*radius;
        return sphere;
    }
    double volume(double H,double R)
    {
        double cylender=3.14*R*R*H;
        return cylender;
    }
    double volume(double L,double B,double H)
    {
        double cuboid=L*B*H;
        return cuboid;
    }
    public static void main(String args[])
    {
        Voloverloading ob=new Voloverloading();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Radius");
        int x=sc.nextInt();
        System.out.println("Volume of sphere="+ob.volume(x));
        System.out.println("Enter the height and radius of the cylender");
        double x1=sc.nextDouble();
        double y=sc.nextDouble();
        System.out.println("Volume of the cylender="+ob.volume(x1,y));
        System.out.println("Enter the lenth,breath and height of the Cuboid");
        double x2=sc.nextDouble();
        double y1=sc.nextDouble();
        double z=sc.nextDouble();
        System.out.println("volume of cuboid ="+ob.volume(x2,y1,z));
    }
}
        