/**
 * Created by Rico on 11/29/2016.
 */
public class TestSandwichFilling {
    public static void main(String[] args)
    {
        SandwichFilling PapaSandwich = new SandwichFilling("Egg",100);
        SandwichFilling MamaSandwich = new SandwichFilling("Veggie",300);
        SandwichFilling DaddySandwich = new SandwichFilling("Ham",900);
        System.out.println(PapaSandwich.getFilling());
        System.out.println(PapaSandwich.getCalories());
        System.out.println(MamaSandwich.getFilling());
        System.out.println(MamaSandwich.getCalories());
        System.out.println(DaddySandwich.getFilling());
        System.out.println(DaddySandwich.getCalories());

    }
}
