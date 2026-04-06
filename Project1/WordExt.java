class WordExt
{
    public static void main(String str)
    {
        String w="",op="";
        char ch;
        str=str.trim();
        str=str+" ";
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;//sky, is, blue
            }
            else
            {
                op=w+" "+op;//sky , is sky, blue is sky
                w="";
            }
        }
            System.out.println(op);
          
    }
}
