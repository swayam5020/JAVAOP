//sentence jo input hoga uska number of characters 1st letter se last tak 1-2-3 size k order mai hoga Ex: I am the lord.
import java.util.*;
import java.util.StringTokenizer;
class Snowball
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence :");
        String sentence=sc.nextLine();
        sentence= sentence.trim();
        boolean result=true;
        if(sentence.charAt(sentence.length()-1) != '.' && sentence.charAt(sentence.length()-1) != '?' && sentence.charAt(sentence.length()-1) != '!')
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else
        {
            StringTokenizer str= new StringTokenizer(sentence," .!?,");
            int count=0;
            for(int i=1; i <= str.countTokens(); i++)
            {
                String word=str.nextToken();
                if(i==1)
                {
                    count=word.length();
                }
                if(count!=word.length())
                {
                    result=false;
                }
                count++;
            }
            if(result==true)
            {
                System.out.println("The entered sentence is a Snowball.");
            }
            else
            {
                System.out.println("The entered sentence is not a snowball.");
            }
        }
    }
}

