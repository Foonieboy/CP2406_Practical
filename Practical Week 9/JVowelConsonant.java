import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Rico on 1/17/2017.
 */
public class JVowelConsonant extends JFrame implements ActionListener {
    JPanel firstPanel = new JPanel(new GridLayout(2,2));
    JPanel secondPanel = new JPanel(new GridLayout(2,2));
    JLabel desc = new JLabel("<html>Press on the button to show whether it is vowel or consonant</html>");
    ArrayList<String> characterList = new ArrayList<String>();
    ArrayList<String> vowel = new ArrayList<String>();
    public JVowelConsonant()
    {
        super("Vowel and Consonant");
        setLayout(new GridLayout(1,3,20,20));
        add(firstPanel);
        add(secondPanel);
        add(desc);
        desc.setHorizontalAlignment(JLabel.CENTER);
        setSize(600,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        for(char alphabet = 'A'; alphabet <= 'Z';alphabet++) {
            characterList.add(String.valueOf(alphabet));
        }
        for(int x = 0; x<4; x++)
        {
            int y = new Random().nextInt(characterList.size());
            JButton button = new JButton(characterList.get(y));
            button.addActionListener(this);
            firstPanel.add(button);
            characterList.remove(y);
            int z = new Random().nextInt(characterList.size());
            JButton button2 = new JButton(characterList.get(z));
            button2.addActionListener(this);
            secondPanel.add(button2);
            characterList.remove(z);
        }
        vowel.add("A");
        vowel.add("I");
        vowel.add("U");
        vowel.add("E");
        vowel.add("O");

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(vowel.contains(e.getActionCommand()))
        {
            desc.setText("It is a vowel");
        }
        else
        {
            desc.setText("It is a consonant");
        }
        JButton var = (JButton) e.getSource();
        int y = new Random().nextInt(characterList.size());
        var.setText(characterList.get(y));
    }

    public static void main(String[] args)
    {
        JVowelConsonant test = new JVowelConsonant();
    }
}
