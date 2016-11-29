/**
 * Created by Rico on 11/29/2016.
 */
public class TestPatient {
    public static void main(String[] args)
    {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient("10",40, new BloodData("B","+"));
        System.out.println(patient1.getId());
        System.out.println(patient1.getAge());
        System.out.println(patient1.getBlood_data().getBlood_type());
        System.out.println(patient1.getBlood_data().getRh());
        System.out.println(patient2.getId());
        System.out.println(patient2.getAge());
        System.out.println(patient2.getBlood_data().getBlood_type());
        System.out.println(patient2.getBlood_data().getRh());
    }
}
