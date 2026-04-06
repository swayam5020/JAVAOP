class FreLetters
{
    public static void main(String s)
    {
        int c;
        char ch;
        s=s.toUpperCase();
        for(char i='A';i<='Z';i=(char)(i+1))
        {
            c=0;
            for(int j=0;j<s.length();j++)
            {
                ch=s.charAt(j);
                if(i==ch)
                {
                    c++;
                }
            }
            if(c!=0)
            System.out.println(i+" frequency is "+c);
        }
    }
}