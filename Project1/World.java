//sky is blue -> blue is sky
class World
{
    public static void main(String str)//sky is blue
    {
        String op="",word="", sent="";
        char ch;
        str=str.trim();
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);//s,k,y,' ',i,s,b,l,u,e
            if(ch!=' ')
                word=word+ch;//s,sk,sky,i,is,blue
            else
            {
                sent=word+" "+sent;//sky, is sky, blue is sky
                word="";
            }
            System.out.println(sent);
       }
    }
}