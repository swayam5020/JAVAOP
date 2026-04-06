import java.io.*;
class BufInput5
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter a integer ");
        int n1=Integer.parseInt("5");
        System.out.println("Enter a Double ");
        double d= Double.parseDouble(br.readLine());
        System.out.println("Enter a Float ");
        float f= Float.parseFloat(br.readLine());
        System.out.println("Enter a Long ");
         
        long l= Long.parseLong(br.readLine());
        System.out.println("Enter a Name ");
        String s= br.readLine();
        System.out.println("Enter a Character ");
        char ch= br.readLine().charAt(0);//er , e
        System.out.println("Enter a Boolean ");
        boolean b= Boolean.parseBoolean(br.readLine());
         
        
    }
}