//q. Inout a String and print length of every word. Ex: Inp: Hello how are you Output: Hello =5 how=3 are=3 you=3
class SinRev
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
              w=w+ch;
            }
            else
            {
                System.out.println(w+"="+w.length());
                w="";
            }

        }
    }
}
        
            