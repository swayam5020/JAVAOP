class Str
{
    public static void main()
    {
        String s="ICSE";
        for(int i=0;i<s.length();i++)
        {
           // System.out.println(s.charAt(i));
            System.out.println(s.substring(0,i+1));
        }
    }
}