//Program to generate any number between 25 to 35(including them) 
class Random
{
    public static void main(String args[])
    {
        int a=24;
        int b=36;
        double d=(double)((Math.random()*(b-a))+a);
        System.out.println(d);
    }
}
        
        
    