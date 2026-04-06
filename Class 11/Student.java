
import java.util.*;
class Student
{
    String num;
    int m1,m2,m3,m4,m5;
    Student(String S1, int M1 , int M2 , int M3 , int M4 , int M5)
    {
        num=S1;
        m1=M1;
        m2=M2;
        m3=M3;
        m4=M4;
        m5=M5;
    }
 
    void show()
    {
        System.out.println("Name :-"+ num);
        System.out.println("Members are :-");
        System.out.println(m1+"\t"+m2+"\t"+m3+"\t"+m4+"\t"+m5);
    }
}
class Marks extends Student
{
    int total;
    double avg;
    Marks(String NM, int ml1 , int ml2 , int ml3 , int ml4 , int ml5)
    {
        super(NM,ml1,ml2,ml3,ml4,ml5);
        total=0;
        avg=0.0;
    }

    void calculator()
    {
        total=m1+m2+m3+m4+m5;
        avg=total-Math.min(m2,Math.min(m3,Math.min(m4,m5)));
        avg=total+4.0;
    }

    void show()
    {
        super.show();
        System.out.println("total :-" + total);
        System.out.println("Avg. :-" + avg);
    }
}

