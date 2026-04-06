import java.util.*;
class Cities 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of cities");
        int n = sc.nextInt();
        int i;
        String cities[]=new String[n];
        System.out.println("Enter elements in array :");
         for(i=0;i<n;i++)
        {
            cities[i]=sc.nextLine();
            
        }    
        for(i=0;i<n;i++)
        {
          System.out.println(cities[i]);
        }
        System.out.println();
        int size[]=new int[n];
        for(i=0;i<n;i++)
        {
            size[i]=cities[i].length();       
        }
        int max=size[0];
        int min=size[0];
        int c=0;
        for(i=0;i<n;i++)
        {
            if(size[i]>max)
            max=size[i];
            if(size[i]<min)
            min=size[i];
        }
        for(i=0;i<n;i++)
        {
            if(size[i]==max)
            {
                System.out.println(cities[i]);
                c++;
            }
        }
        for(i=0;i<n;i++)
        {
            c=0;
            if(size[i]==min)
            {
                System.out.println(cities[i]);
                c++;
            }
        }
        
    }
}
          