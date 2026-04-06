class StrVowel2
{
    public static void main(String s)
    {
        int i;
        char ch;
        s=s.toUpperCase();
        int c=0;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')    
            
            c++;
        }
        System.out.println(c);
    }
}