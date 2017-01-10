/**
 * Created by Rico on 1/10/2017.
 */
import javax.swing.*;
import java.awt.*;
public class JBookQuote {
    public static void main(String[] args)
    {
        JFrame bookquote2 = new JFrame("Bookquote");
        JPanel listOfQuote = new JPanel(new GridLayout(2,1));
        bookquote2.setSize(300,250);
        bookquote2.setContentPane(listOfQuote);

        bookquote2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        bookquote2.setLocationRelativeTo(null);
        JLabel book1quote = new JLabel("Hasta la vista");
        book1quote.setHorizontalAlignment(JLabel.CENTER);
        JLabel book2quote = new JLabel("Adios");
        book2quote.setHorizontalAlignment(JLabel.CENTER);
        listOfQuote.add(book1quote);
        listOfQuote.add(book2quote);
        bookquote2.setVisible(true);
    }
}
