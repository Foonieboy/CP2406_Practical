/**
 * Created by Rico on 11/29/2016.
 */
public class TestBread {
    public static void main(String[] args)
    {
        Bread Chocolate = new Bread("rye",100);
        Bread Plain = new Bread("cocoa",200);
        Bread Croissant = new Bread("powder",300);
        System.out.println(Chocolate.getBread());
        System.out.println(Chocolate.getCalories());
        System.out.println(Chocolate.getMOTTO());
        System.out.println(Plain.getBread());
        System.out.println(Plain.getCalories());
        System.out.println(Plain.getMOTTO());
        System.out.println(Croissant.getBread());
        System.out.println(Croissant.getCalories());
        System.out.println(Croissant.getMOTTO());
    }
}
