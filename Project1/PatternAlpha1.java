/*
 * ASCII
 * a=97, b=98
 * A=65, B=66
 * 
 */
/*
 * a
 * a b 
 * a b c 
 * a b c d
 * a b c d e
 */
class PatternAlpha1
{
    public static void main(int n)
    {
        int i,j;
        char ch;
        for (i=1;i<=n;i++)//2 3 4 5
        { 
            ch='a';
            for(j=1;j<=i;j++)//a b 
            {
                System.out.print((char)(ch+j-1) +" ");
            }
            System.out.println();    
        }
    }
}  