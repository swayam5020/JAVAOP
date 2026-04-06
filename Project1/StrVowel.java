//print all vowels present in a string s="hello" ,, o/p - e, o
class StrVowel
{
    public static void main(String s)
    {
        int i,c=0;
        char ch;
        s=s.toUpperCase();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            c++;
        }
        System.out.println(c);
    }
}
       
       