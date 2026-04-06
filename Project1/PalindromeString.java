//q. input a staing and check if its palindrome or not System.out.println(s.equalsIgnoreCase("COmputer Application"));///true
class PalindromeString
{
    public static void main(String s)
    {
        int i;
        char ch;
        String rev="";
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            rev=ch+rev;
        }
        
        if(s.equalsIgnoreCase(rev))
        {
           System.out.println("The Enterd String is a palindrome");
        }
        else
        {
            System.out.println("The Enterd String is not a palindrome");
        }
    }
}