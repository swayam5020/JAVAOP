/*Register is an entity which can hold a maximum of 100 names. The register enables
the user to add and remove names from the top most end only. Define a class Register
with the following details: */
class Register
{
    String stud[]; 
    int cap,top;
    Register(int max)
    {
        cap= max;
        top= -1;
        stud=new String[cap];
    }
    void push(String n)
    {
        if(top<cap-1)
        stud[++top]=n;
        else
        System.out.println("OVERFLOW");
    }
    String pop()
    {
        if(top>=0)
        return stud[top--];
        else
        System.out.println("UNDERFLOW");
        return"$$";
    }
    void display()
    {
        if(top==-1)
        System.out.println("Register is empty");
        else
        for(int i=top;i>=0;i--)
        System.out.println(stud[i]);
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        