import java.util.Scanner;

public class Factors  
{
   public static void main(String[] args) 
{
       
       int number = 0;

       
       Scanner scan = new Scanner(System.in);

       
       System.out.print("Enter a number:: ");
       number = scan.nextInt();

       
       System.out.print("The factors are:: ");
       for(int i=1; i <= number; i++) 
       {
           if(number % i == 0)
               System.out.print(i);
       }

       
       

   }
}