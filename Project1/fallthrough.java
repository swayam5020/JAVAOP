public class fallthrough
{
    public static void main( char ch)
    {
        switch(ch)
        {
        case 'a' : System.out.println("A");
        case 'b' : System.out.println("B");
        case 'c' : System.out.println("C");
        break;
        case 'd' : System.out.println("D");
        default : System.out.println("E");
    }
    }
}
