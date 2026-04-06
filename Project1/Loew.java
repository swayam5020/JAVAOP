class Loew
{
    public static void main(String str)
    {
        Loew ob=new Loew();
        String op="",word="", sent="";
        char ch;
        int size=0;
        str=str.trim();
        str=str+" ";
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
                word=word+ch;
            else if(ch==' ')
            {
                size=size+word.length();
                word="";
            }
            System.out.println(size);
        }
        
        }
           boolean isPalin(String s)
    {
        int n=s.length();
        int flag=0;
        for(int i=0,j=n-1;i<j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                flag=1;
                break;
            }
        }
        if(flag==0) 
            return true;
        else 
            return false;
    }
}
    
                