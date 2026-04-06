import java.util.*;
class Profitandloss
{
    public static void main(double SP,double CP)
    {
        double profit=SP-CP;
        double loss=CP-SP;
        {
            if(SP>CP)
            System.out.println("Profit ="+ profit+"Profit pecentage ="+(profit*100)/CP);
        }
        {
            if(CP>SP)
            System.out.println("Loss="+loss+"Loss percentage ="+(loss*100)/CP);
        }
        {
        if(SP==CP)
        System.out.println("Neither profit nor loss");
    }
    }
}
        
        
    
        