

import java.util.*;
class choice 
{
   public static void main ()
   {
       int a,b;
       System.out.println("Enter 2 numbers");
       Scanner s= new Scanner(System.in);
       a=s.nextInt();
       b=s.nextInt();
       System.out.println("Enter your choice");
       System.out.println("Press 1 for sum of the numbers,press 2 to get the square root of th numbers");
       System.out.println("Press 3 to check the greater value and press 4 to get the smaller value");
       int ch=s.nextInt();
       if(ch==1)
       {
       System.out.println("Sum="+(a+b));
    }
        else if(ch==2)
    {
        System.out.println(Math.sqrt(a));
        System.out.println(Math.sqrt(b));
    }
    else if (ch==3)
    {
        System.out.println(Math.max(a,b));
    }
    else if(ch==4)
    {
        System.out.println(Math.min(a,b));
    }
    else 
    {
        System.out.println("Invalid choice");
    }
}
}



   


