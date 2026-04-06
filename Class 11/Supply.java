
class Supply extends Demand
{
    int pproduced;
    double prate;
    double diff;
    Supply(String NM, String MN, int S2 , int p1, double p2)
    {
        super(NM,MN,S2);
        pproduced=p1;
        prate=p2;
    }
     double calculation()
    {
        double aod=prate*pdemand;
        double aop=prate*pproduced;
        diff= aod-aop;
        System.out.println("Difference : "+diff);
        return diff;
    }
    void display()
    {
        super.display();
        calculation();
    }
}