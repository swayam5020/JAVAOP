import java.util.*;
class Avgmarks
{
    public static void main(String args [])
    {
        Scanner in=new Scanner(System.in);
        int phy,chem,bio;
        double Avg;
        System.out.println("Enter your marks of Physics,Chemistry and Biology");
        phy=in.nextInt();
        chem=in.nextInt();
        bio=in.nextInt();
        Avg=((phy+chem+bio)/3);
        long round=Math.round(Avg);
        System.out.println("The average marks="+Avg);
        System.out.print("it will be"+round+"when rounded of");
    }
}
    
