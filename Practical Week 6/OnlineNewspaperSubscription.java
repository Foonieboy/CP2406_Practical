/**
 * Created by Rico on 12/20/2016.
 */
public class OnlineNewspaperSubscription extends NewspaperSubscription
{
    OnlineNewspaperSubscription(String nm, String add, double rt)
    {
        super(nm,add,rt);
        setAddress();
    }
    public void setAddress()
    {
        if(getAddress().contains("@"))
        {
            rate = 9;
        }
        else
        {
            System.out.println("Invalid email address");
        }
    }
}
