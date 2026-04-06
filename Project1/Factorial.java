class Factorial 
{
    public static void main(int a)
    {
        
        Factorial ob=new Factorial();
        
       int f=ob.factorial(a);
    System.out.println("Factorial of a="+f);
    
    }
    int factorial(int n)
    {
        int f=1;//f=4 
        for(int i=1; i <=n; i++)
        
        f=f*i;//4*1=4 4*2=8 8*3=24 24*4=96
        return f;
        
    }
}
    
       
           
           
           
        
        
        
    
     
        
    
    