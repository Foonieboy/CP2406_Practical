/**
 * Created by Rico on 12/20/2016.
 */
public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    PhysicalNewspaperSubscription(String nm, String add, double rt)
    {
        super(nm,add,rt);
        setAddress();
    }
    public void setAddress()
    {
        if(getAddress().matches(".*\\d.*"))
        {
            rate = 15;
        }
        else
        {
            System.out.println("Invalid address");
            rate = 0;
        }
    }
}
