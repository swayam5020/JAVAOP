import java.util.*;
class comp
{
    int x;
    comp(int y)
    {
        x=y;
    }
    void display()
    {
       System.out.print(x%100);
    }
    public static void main()
       {
         int x=2,y=5;
         comp ob=new comp(521);
         ob.display();
         comp ob1=new comp(1004);
         ob1.display();
        }   
    }
