class StringIni
{
    public static void main(String name)
    {
        String ini="";
        int i;
        char ch;
        name=name.trim();//amit das 
        name=" "+name;//" amit das"
        name=name.toUpperCase();//AMIT DAS
        for(i=0;i<name.length();i++)
        {
           ch=name.charAt(i);
           if(ch==' ')
           ini=ini+name.charAt(i+1)+".";
        }
        System.out.println("Name initials"+ini);
    }
}