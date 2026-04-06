class Demand
{
    String pid;
    String pname;
    int pdemand;
    Demand(String S1, String S2, int I1)
    {
        pid=S1;
        pname=S2;
        pdemand=I1;
    }
    void display()
    {
        System.out.println("Product Name : " +pname);
        System.out.println("Product Id : " +pid);
        System.out.println("Demand : " +pdemand);
    }
}
