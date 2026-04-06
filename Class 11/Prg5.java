import java.io.DataInputStream;
class Prg5
{
    public static void main(String args)
    {
        DataInputStream in=new DataInputStream(System.in);
        float marks[][]=new float[5][3];
        float total[]=new float[5];
        char grade[]=new char[5];
        float avg;
        int i,j;
        try
        {
            for(i=0;i<5;i++)
            {
                System.out.println("Enter marks for Students"+(i+1));
                total[i]=0;
                for(j=0;j<3;j++)
                {
                    System.out.println("Marks in student"+(j+1)+":");
                    marks[i][j]=Float.parseFloat(in.readLine());
                }
            }
            for(i=0;i<5;i++)
            {
                total[i]=0;
                for(j=0;j<3;j++)
                total[i] +=marks[i][j];
                avg=total[i]/3;
                if(avg<45.0)
                grade[i]='D';
                else if(avg<60.0)
                grade[i]='C';
                else if(avg<75.0)
                grade[i]='B';
                else
                grade[i]='A';             
            }
            for(i=0;i<5;i++)
            {
                System.out.println("Student"+(i+1));
                System.out.println("Total Marks ="+total[i]);
                System.out.println("\tGrade ="+grade[i]);
            }
        }
        catch(Exception e){}
    }
}

        
    

            