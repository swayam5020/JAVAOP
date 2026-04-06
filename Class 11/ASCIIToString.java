import java.util.*;

public class ASCIIToString 
{
    String s="";
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ASCII value");
        s = sc.nextLine();
    }

    void check()
    {
        for(int i=0; i<s.length(); i++)
        {
            if((int)s.charAt(i)<48 || (int)s.charAt(i)>57)
                invalid();
        }
    }

    String decrypt()
    {
        try
        {
            String sen = "", sub;
            int c=0;

            for(int i=0; i<s.length(); i+=2)
            {
                sub = s.substring(i, i+2);
                c = Integer.parseInt(sub);

                if(c<32)
                {
                    sub = s.substring(i, i+3);
                    c = Integer.parseInt(sub);
                    i+=1;
                }

                sen += (char)(c);
            }
            return sen;
        }
        catch(Exception e)
        {
            invalid();
        }
        return "";
    }

    void invalid()
    {
        System.out.println("Invalid input");
        System.exit(0);
    }

    public static void main()
    {
        ASCIIToString obj = new ASCIIToString();

        obj.input();
        obj.check();
        System.out.println(obj.decrypt());
    }
}