//token program
import java.util.*;
class Tekun
{
    public static void main()
    {
        String str = "Hello, world! This is a test.";
        StringTokenizer tokenizer = new StringTokenizer(str, " ,.!");

        while (tokenizer.hasMoreTokens()) 
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}

