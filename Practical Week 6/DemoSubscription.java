/**
 * Created by Rico on 12/20/2016.
 */
public class DemoSubscription {

    public static void main(String[] args)
    {
        NewspaperSubscription man1 = new PhysicalNewspaperSubscription("Bobie","G15",10);
        NewspaperSubscription man2 = new PhysicalNewspaperSubscription("Bobidde","GHDHD",10);
        NewspaperSubscription man3 = new OnlineNewspaperSubscription("Ada","@bfjabd",30);
        NewspaperSubscription man4 = new OnlineNewspaperSubscription("Addfa","bfjabd",30);
        System.out.println(man1.getRate());
        System.out.println(man2.getRate());
        System.out.println(man3.getRate());
        System.out.println(man4.getRate());
    }
}
