/*Define a class to accept two strings, convert them into uppercase, check and display
whether two strings are equal or not, if the two strings are not equal, print the string with
the highest length or print the message both the strings are of equal length.*/
import java.util.*;
class TwoStrns
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the 1st string");
            String str=sc.nextLine();
            System.out.println("Enter the 2nd string");
            String str2=sc.nextLine();
            int i;
            if(str.equals(str2))
            {
                System.out.println("The two strings are equal");
            }
            else if(str.length()>str2.length())
            {
                System.out.println(str.length());
            }
            else if(str.length()<str2.length())
            {
               System.out.println(str2.length());
            }
            else if(str.length()==str2.length())
            {
                System.out.println("Length of both strings are same");
            }
        }
    }
        