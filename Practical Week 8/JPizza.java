/**
 * Created by Rico on 1/10/2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPizza {
    public static void main(String[] args)
    {
        JFrame pizzaria = new JFrame("Pizzaria order");
        JPanel content = new JPanel(new GridLayout(3,1));
        pizzaria.setSize(300,250);
        pizzaria.setContentPane(content);
        pizzaria.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pizzaria.setLocationRelativeTo(null);
        String[] pizzaSize = {"Small ($7)", "Medium ($9)", "Large($11)", "Extra large ($14)"};
        JComboBox pizzaSizeChoice = new JComboBox(pizzaSize);
        content.add(pizzaSizeChoice);
        String[] toppingChoice = {"Cheese","Pepperoni (Additional $1)", "Mushroom (Additional $1)", "Bacon (Additional $1)", "Crabstick(Additional $1)"};
        JComboBox pizzaToppingChoice = new JComboBox(toppingChoice);
        content.add(pizzaToppingChoice);
        JButton buy = new JButton("Buy");
        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String choice = pizzaSizeChoice.getSelectedItem().toString();
                int pizzaChoice = pizzaSizeChoice.getSelectedIndex();
                int pizzaPrice = 0;
                if(pizzaChoice == 0)
                {
                    pizzaPrice = 7;
                }
                else if(pizzaChoice == 1)
                {
                    pizzaPrice = 9;
                }
                else if(pizzaChoice == 2)
                {
                    pizzaPrice = 11;
                }
                else if(pizzaChoice == 3)
                {
                    pizzaPrice = 14;
                }
                int toppingChoice = pizzaToppingChoice.getSelectedIndex();
                int toppingPrice =0;
                if(toppingChoice == 0 )
                {
                    toppingPrice = 0;
                }
                else
                {
                    toppingPrice = 1;
                }
                int totalPrice = pizzaPrice+toppingPrice;
                JOptionPane.showMessageDialog(buy,"Your choice is " + choice + " with " +
                        pizzaToppingChoice.getSelectedItem().toString()+"\nTotal Price is: $" + totalPrice);
            }
        });
        content.add(buy);
        pizzaria.setVisible(true);

    }
}
