import java.util.*;
class Student1
{
    //data members or instance variable
    String name;
    int roll;
    static int marks;// class variable
    //Member functions
    Student1()//Default Constructor or no argument constructor
    {
        name="XXX";
        roll=0;
        marks=0;   
    }
    Student1(String n)//one argument constructor
    {
        name=n;
        roll=0;
        marks=0;   
    }
    Student1(String n,int r, int m)// 3 argument constructor
    {
        name=n;
        roll=r;
        marks=m;   
    }
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
        Student1 s1=new Student1("Yash"); 
        Student1 s2=new Student1();
        Student1 s3=new Student1("Hardik",35,78);//constructor overload
        System.out.println("Details of 1st student after creation = ");
        s1.display();
        System.out.println("Details of 2nd student after creation = ");
        s2.display();
        System.out.println("Details of 3rd student after creation = ");
        s3.display();
        System.out.println("Enter Details of 1st student = ");
        s1.input();
        System.out.println("Enter Details of 2ndt student = ");
        s2.input();
        System.out.println("Details of 1st student = ");
        s1.display();
        System.out.println("Details of 2nd student = ");
        s2.display();
       //  s1.marks=s1.marks+10;
       // System.out.println("Details of 1st student = ");
       // s1.display();
        
    }
}