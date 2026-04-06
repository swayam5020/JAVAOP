//WAP to input 3 angs of a triangle and check weather a triangle is possible or not //
class Triangle
{
    public static void main(int a,int b,int c)
    {
        {
        if (a+b+c == 180)
        System.out.println("abc is a tringale");
    }
    
    {
    if(a+b+c==180&&a==90||a+b+c==180&&b==90||a+b+c==180&&c==90)
    System.out.println("abc is a right angel triangle");
    }
    {
    if(a+b+c==180&&a<90&&b<90&&c<90)
    System.out.println("abc is an acute angle triangle");
    }
    {
    if(a+b+c==180&&a>90||b>90||c>90)
    System.out.println("abc is an obtuse angle triangle");
    }
    {
    if(a+b+c!=180)
    System.out.println("abc is not a triangle");
    }
}
}

        
        

        
    

