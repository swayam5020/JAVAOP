//Write a program to input a sentence and convert it into uppercase and count and display the total number of words starting with a letter ‘A’.
import java.util.*;
class LetterA
{
    public static void main(String str)
    {
        str=str.trim();
        String upper=str.toUpperCase();
        upper=" "+upper;
        int count=0,i;
        for (i=0;i<upper.length();i++) 
        {
            if(upper.charAt(i) == ' ' && upper.charAt(i+1)=='A')
            count++;
            
        }
        System.out.println("Number of A is :"+count);
    }
}
        
            