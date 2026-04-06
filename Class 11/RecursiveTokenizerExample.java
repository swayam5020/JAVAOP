import java.util.Scanner;
import java.util.StringTokenizer;

class RecursiveTokenizerExample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a comma-separated list of values: ");
        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input, ",");
        int sum = sumIntegers(tokenizer);

        System.out.println("Sum of all integers in the list: " + sum);

    }

    public static int sumIntegers(StringTokenizer tokenizer) 
    {
        if (!tokenizer.hasMoreTokens()) 
        {
            return 0;
        }

        String token = tokenizer.nextToken();
        int value = 0;

        try 
        {
            value = Integer.parseInt(token);
        } catch (NumberFormatException e) 
        {
             //ignore non-integer tokens;
        }

        return value + sumIntegers(tokenizer);
    }
}
