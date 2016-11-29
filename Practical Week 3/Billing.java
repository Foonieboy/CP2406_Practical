/**
 * Created by Rico on 11/29/2016.
 */
import javax.swing.JOptionPane;
public class Billing {
    public static void main(String[] args) {
        String input;
        double price;
        int quantity;
        double coupon;
        input = JOptionPane.showInputDialog(null, "Enter the price", "Price",
                JOptionPane.INFORMATION_MESSAGE);
        while(input.equals(""))
        {
            JOptionPane.showMessageDialog(null,"You need to input a price");
            input = JOptionPane.showInputDialog(null, "Enter the price", "Price",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        price = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null, "Enter the quantity", "Quantity",
                JOptionPane.INFORMATION_MESSAGE);
        if(input.equals(""))
        {
            quantity = 1;
        }
        else
        {
            quantity = Integer.parseInt(input);
        }
        input = JOptionPane.showInputDialog(null, "Enter the coupon", "Coupon",
                JOptionPane.INFORMATION_MESSAGE);
        if(input.equals(""))
        {
            coupon = 0;
        }
        else
        {
            coupon = Double.parseDouble(input);
        }
        computeBill(price);
        computeBill(price,quantity);
        computeBill(price,quantity,coupon);
    }
    public static void computeBill(double price)
    {
        double total;
        final double taxMultiplier = 1.08;
        total = price*taxMultiplier;
        JOptionPane.showMessageDialog(null,"The final price is: $" + total);
    }
    public static void computeBill(double price, int quantity)
    {
        double total;
        final double taxMultiplier = 1.08;
        total = quantity*price*taxMultiplier;
        JOptionPane.showMessageDialog(null,"The final price is: $" + total);
    }
    public static void computeBill(double price, int quantity, double coupon)
    {
        double total;
        final double taxMultiplier = 1.08;
        total = ((quantity*price)-coupon)*taxMultiplier;
        JOptionPane.showMessageDialog(null,"The final price is: $" + total);
    }
}
