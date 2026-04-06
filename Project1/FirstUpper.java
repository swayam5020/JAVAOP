/*Write a program in Java to accept a string in lower case and change the first letter of every word to upper case. Display the new string. [15]
Sample input: we are in cyber world
Sample output : We Are In Cyber World*/
import java.util.*;
class FirstUpper
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int i;
        System.out.println("Enter a sentence:");
        String str = in.nextLine();
        str=str.toLowerCase();
        str=" "+str;
        String word = "";
        for (i=0;i<str.length();i++) 
        {
            if (str.charAt(i)==' ') 
            
            {
                word=word+str.charAt(i)+(Character.toUpperCase(str.charAt(i+1)));    
                i++;
            }
            else
            {
                word=word+str.charAt(i);
            }

        }
        word=word.trim();
        System.out.println(word);
    }
}

