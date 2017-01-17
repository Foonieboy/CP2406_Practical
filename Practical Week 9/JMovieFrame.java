import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rico on 1/17/2017.
 */
public class JMovieFrame extends JFrame implements ActionListener{
    JLabel movieDesc = new JLabel("Movie release:   Cast:");
    JButton movieEast = new JButton("Journey to the east");
    JButton movieNorth = new JButton("North star");
    JButton movieWest = new JButton("Wild west");
    JButton movieSouth = new JButton("King of the south");
    public JMovieFrame()
    {
        super("Movie");
        setLayout(new BorderLayout());
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(movieEast,BorderLayout.EAST);
        movieEast.addActionListener(this);
        add(movieNorth,BorderLayout.NORTH);
        movieNorth.addActionListener(this);
        add(movieWest,BorderLayout.WEST);
        movieWest.addActionListener(this);
        add(movieSouth,BorderLayout.SOUTH);
        movieSouth.addActionListener(this);
        add(movieDesc,BorderLayout.CENTER);
        movieDesc.setHorizontalAlignment(JLabel.CENTER);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==movieEast)
        {
            movieDesc.setText("Movie release: 1990  Cast: Jackie chen");
        }
        else if(e.getSource()==movieNorth)
        {
            movieDesc.setText("Movie release: 2011  Cast: Arnold");
        }
        else if(e.getSource()==movieWest)
        {
            movieDesc.setText("Movie release: 2000  Cast: Shia");
        }
        else if(e.getSource()==movieSouth)
        {
            movieDesc.setText("Movie release: 2016  Cast: Dwayne Johnson");
        }
    }
    public static void main(String[] args)
    {
        JMovieFrame test = new JMovieFrame();
    }
}
