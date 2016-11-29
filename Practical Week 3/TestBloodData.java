/**
 * Created by Rico on 11/29/2016.
 */
public class TestBloodData {
    public static void main(String[] args)
    {
        BloodData test1 = new BloodData();
        BloodData test2 = new BloodData("A", "-");
        System.out.println(test1.getRh());
        System.out.println(test1.getBlood_type());
        System.out.println(test2.getRh());
        System.out.println(test2.getBlood_type());
        test1.setBlood_type("AB");
        test1.setRh("-");
        System.out.println(test1.getRh());
        System.out.println(test1.getBlood_type());
    }
}
