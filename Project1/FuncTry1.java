class FuncTry1
{
    public static void main(String args[])
    {
        //Wrapper class
        Integer a=new Integer(3);
        Float f=3.2f;
        Short s=3;
        System.out.println("int = "+a);
        System.out.println("float = "+f);
        // Conversion fuctions for string to basic data type
        int a1=Integer.parseInt("21");
        System.out.println("String to int = "+a1);
        double a2=Double.parseDouble("21.2");
        System.out.println("String to double = "+a2);
        //using vaueOf function same as parseInt
        int a4=Integer.valueOf("21");
        // Conversion fuctions for basic data type to string
        int b1=21;
        double d1=21.1;
        String s1=b1+"";//"21"
        String s2=Integer.toString(b1);//"21"
        String s3=Double.toString(d1);//"21.1"
    }
}
        