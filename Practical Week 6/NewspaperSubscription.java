/**
 * Created by Rico on 12/20/2016.
 */
public abstract class NewspaperSubscription {
    private String name;
    protected String address;
    protected double rate;

    NewspaperSubscription(String nm, String add, double rt)
    {
        name = nm;
        address = add;
        rate = rt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    public abstract void setAddress();

}
