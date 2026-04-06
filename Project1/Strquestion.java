import java.util.*;
class Strquestion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name");
        String s=sc.nextLine();
        String str="";
        s=s.trim();//deletes extra space (start and end)
        int i;
        char ch;
        int count=0;
        String surname=s.substring(s.lastIndexOf(' ')+1);
        System.out.println("Surname= "+surname);
        for(i=0;i<surname.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')  
             count++;
        }
        System.out.println("No. of vowels= "+count);
    }
}