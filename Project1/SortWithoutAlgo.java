class SortWithoutAlgo
{
    public static void main(String s)
    {
        int c;
        char ch;
        String op="";
        s=s.toUpperCase();
        for(char i='A';i<='Z';i=(char)(i+1))
        {
            for(int j=0;j<s.length();j++)
            {
                ch=s.charAt(j);
                if(i==ch)
                {
                    op=op+ch;
                }
            }
           
        }
         System.out.println("After Sort  "+op);
    }
}
