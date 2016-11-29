/**
 * Created by Rico on 11/29/2016.
 */
public class TestSandwich {
    public static void main(String[] args)
    {
        Sandwich Goodtime = new Sandwich("rye",100 , "egg", 100);
        Sandwich Hari = new Sandwich("cocoa",200,"veggie",300);
        Sandwich Rico = new Sandwich("powder",300, "ham", 900);
        System.out.println(Goodtime.getBread().getBread());
        System.out.println(Goodtime.getFilling().getFilling());
        System.out.println(Goodtime.getTotalCalories());
        System.out.println(Hari.getBread().getBread());
        System.out.println(Hari.getFilling().getFilling());
        System.out.println(Hari.getTotalCalories());
        System.out.println(Rico.getBread().getBread());
        System.out.println(Rico.getFilling().getFilling());
        System.out.println(Rico.getTotalCalories());

    }
}
