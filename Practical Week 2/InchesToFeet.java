/**
 * Created by Rico on 11/22/2016.
 */
public class InchesToFeet {
    public static void main(String[] args)
    {
        int inches = 86;
        int feet = convertInchesToFeet(inches);
        int remaindingInches = remainderFromConvertingInchesToFeet(inches);
        System.out.println(inches + " inches is " + feet + " feet and " + remaindingInches + " inches.");
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
