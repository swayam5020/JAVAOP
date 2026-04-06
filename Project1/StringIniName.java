/*
 *  Amit Kumar Das
 * O/p : A.K.D.
 */
class StringIniName
{
    public static void main(String s)
    {
        String str="";
        s=s.trim();//deletes extra space (start and end)
        s=" "+s;
        int i;
        char ch;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                str=str+s.charAt(i+1)+".";
            }
           System.out.println("Initials:"+str);
        }
}
}