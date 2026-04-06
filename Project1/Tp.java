import java.util.*;
class Tp
{
    public static void main()
    {
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        
        String[] name = new String[n];
        int[] ben = new int[n];
        int[] eng = new int[n];
        int[] total = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter name of Student ");
            name[i] = sc.nextLine();
            System.out.println("Enter Bengali marks of Student ");
            ben[i] = sc.nextInt();
            System.out.println("Enter English marks of Student ");
            eng[i] = sc.nextInt();
            total[i]=ben[i]+eng[i];
        }
        for(int i=0; i<n; i++)
        {
            System.out.println("Name: "+name[i]);
            System.out.println("Total Marks: "+total[i]);
        }
    }
}

           