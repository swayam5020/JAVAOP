import java.util.*;
class tp2
{
    public static void main()
    {
        int a[ ] = {5,10,20,25,35};
for(int i=0;i<5;i++)
a[i] = a[5-i-1];
  for(int i=0;i<5;i++)
System.out.print(a[i]+ " ");  
    }
}