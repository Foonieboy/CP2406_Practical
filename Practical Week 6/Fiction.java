/**
 * Created by Rico on 12/20/2016.
 */
public class Fiction extends Book {

    public Fiction(String bkTitle)
    {
        super(bkTitle);
        setPrice();
    }

    public void setPrice()
    {
        bookPrice = 24.99;
    }
}
