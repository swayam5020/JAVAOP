class OddSum
{
    public static void main(int a[])
    {
        int n=a.length;
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                s=s+a[i];
            }
        }
        System.out.println(s);
    }
}