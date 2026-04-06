//Concatenate the first and last letter of the sentence and then create a string with it.
import java.util.*;
class Concatinate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        str=str.trim();
        str=" "+str;
        String word="",word2="",word3="";
        for(int i=0;i<str.length();i++) 
        {
            if (str.charAt(i)==' ') 
            
            {
                word=word+(str.charAt(i+1));
                i++;
                word2=word+(str.charAt(i-1));
            }
        }
        word3=word+word2;
        word3=word3.trim();
        System.out.println(word3);
    }
}
            