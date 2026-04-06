//what is wrapper class?
//Advantage/use
import java.util.*;
class WrapCls
{
    public static void main(String args[])
    {
        int i=2;  
        Integer i1=3;
       // System.out.println("i1="+i1);
        Double d1=new Double(3.5);
        /*
         * Boolean
         * Short
         * Long
         * Float
         */
        //String to basic data type
        String s1="2.3";
        double s1d=Double.parseDouble(s1);//2.3
        String s2="2";
        int s2s=Integer.parseInt(s2);//2.3
        //Basc data type to string
        
        String is1=Integer.toString(i);
        String is2=Double.toString(2.3);
    }
}
   