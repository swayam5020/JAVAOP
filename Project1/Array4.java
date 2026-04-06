//Accept an array and find prime numbers in it
class Array4
{
    public static void main(int a[])
    {
        int n=a.length;
        int i,c=0;
        for(i=0;i<n;i++)
        {
            if(a[i]%i==0)
            c=i++;
            System.out.println(a[i]);
        }
    }
}
            