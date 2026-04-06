/*Define a class to accept a string and convert it into upper case. Count
and display the number of double letter sequence in the string.
Input: HE IS GETTING DOWN WITH HIS LITTLE PUPPY
Output: 3*/
import java.util.*;
class Countkarunga
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        int i,c=0;
        for(i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}