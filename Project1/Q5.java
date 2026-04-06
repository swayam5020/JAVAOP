//Write a Program to accept a string and Print the words that starts and ends with the same letter. Also Print there count.
import java.util.*;
class Q5
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S= sc.nextLine();
        S=S.trim();
        int i,n=S.length(); 
        char ch;
        String w="";
        String opt="";
        for(i=0;i<n;i++)
        {
            ch=S.charAt(i);
            if(ch!=' ')
            {
               w=w+ch;
            }
            else
            {
                char a= w.charAt(0);
                char b=w.charAt(w.length()-1);
                if(a==b)
                {
                    opt=opt+w;
                    System.out.println(opt);
                }
            }
        }
    }
}
                
            
          
        
        
       
    