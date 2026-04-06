class PlinStr
{
    public static void main(String w)
    {
        int flag=0;
        for(int i=0,j =w.length()-1;i<j;i++,j--)
        {
            if(w.charAt(i)!=w.charAt(j))
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Not paln");
        }
        else
        {
            System.out.println("paln");
        }
          
    }
}