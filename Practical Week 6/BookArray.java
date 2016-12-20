import java.awt.print.*;

/**
 * Created by Rico on 12/20/2016.
 */
public class BookArray {
    public static void main(String[] args)
    {
        Book book10[] = new Book[10];
        book10[0] = new Fiction("AHASVBJ");
        book10[1] = new Fiction("DHJBBSDS");
        book10[2] = new Fiction("NDHSDS");
        book10[3] = new Fiction("dada");
        book10[4] = new Fiction("DAFSD");
        book10[5] = new NonFiction("FBSBFJ");
        book10[6] = new NonFiction("Faa");
        book10[7] = new NonFiction("NDSNDNS");
        book10[8] = new NonFiction("dadad");
        book10[9] = new NonFiction("DS");

        for(Book e: book10)
        {
            System.out.println(e.getBookTitle()+" Price = $" + e.getBookPrice());
        }
    }
}
