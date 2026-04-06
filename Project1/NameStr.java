//o.p = A.K.Das
class NameStr
{
    public static void main(String s)
    {
        String str="";
        s=s.trim();
        s=" "+s;
        int i;
        char ch;
        char ds;
        for(i=0;i<s.lastIndexOf(' ');i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                str=str+s.charAt(i+1)+".";
            }
        }
        String surname=s.substring(s.lastIndexOf(' ')+1);
        str=str+surname;
        System.out.println(str);
    }
}
            
            
        