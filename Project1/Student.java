import java.util.*;
class Student
{
    //data members or instance variable
    String name;
    int roll;
    int marks;
    //Member functions
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name = ");
        name=sc.nextLine();
        System.out.println("Enter Roll = ");
        roll=sc.nextInt();
        System.out.println("Enter Marks = ");
        marks=sc.nextInt();
    }
    void display()
    {
        System.out.println("Enter Name = "+name);
        System.out.println("Enter Roll = "+roll);
        System.out.println("Enter Marks = "+marks);
    }
    public static void main(String args[])
    {
        Student s1=new Student();  
        Student s2=new Student();
        System.out.println("Enter Details of 1st student = ");
        s1.input();
        System.out.println("Enter Details of 2ndt student = ");
        s2.input();
        System.out.println("Details of 1st student = ");
        s1.display();
        System.out.println("Details of 2nd student = ");
        s2.display();
        s1.marks=s1.marks+10;
        System.out.println("Details of 1st student = ");
        s1.display();
    }
}