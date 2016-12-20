/**
 * Created by Rico on 12/20/2016.
 */
public class UseBook {
    public static void main(String[] args)
    {
        Book book1 = new Fiction("UVUVWVWVWE");
        Book book2 = new NonFiction("OSaas");
        System.out.println(book1.getBookPrice());
        System.out.println(book2.getBookTitle());
    }
}
