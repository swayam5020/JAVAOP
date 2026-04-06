class StrTryChra
{
    public static void main(String args[])
    {
        String s="hello123wo";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            System.out.print(ch);
            System.out.print(Character.isDigit(ch));
            if(ch>='0' && ch<='9')
                 System.out.print("Its a digit");
            System.out.println();
        }
    }
}