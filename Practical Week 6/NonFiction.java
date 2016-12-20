/**
 * Created by Rico on 12/20/2016.
 */
public class NonFiction extends Book {

    public NonFiction(String bkTitle)
    {
        super(bkTitle);
        setPrice();
    }

    public void setPrice()
    {
        bookPrice = 37.99;
    }
}


