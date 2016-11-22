/**
 * Created by Rico on 11/22/2016.
 */
import javax.swing.JOptionPane;
public class InchesToFeetInteractive {
    public static void main(String[] args)
    {
        String input;
        int inches;
        input = JOptionPane.showInputDialog(null,"Enter the length in inches to convert", "Convert",
                JOptionPane.INFORMATION_MESSAGE);;
        inches = Integer.parseInt(input);
        int feet = convertInchesToFeet(inches);
        int remaindingInches = remainderFromConvertingInchesToFeet(inches);
        JOptionPane.showMessageDialog(null,inches + " inches is " + feet + " feet and " + remaindingInches + " inches.");
    }
    public static int convertInchesToFeet(int inches)
    {
        int feetconversion = inches/12;
        return feetconversion;
    }
    public static int remainderFromConvertingInchesToFeet(int inches)
    {
        int remainedInches = inches%12;
        return remainedInches;
    }
}
