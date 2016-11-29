/**
 * Created by Rico on 11/29/2016.
 */
public class Patient {
    private String Id;
    private int age;
    BloodData blood_data;

    public Patient()
    {
        Id = "0";
        age = 0;
        blood_data = new BloodData();
    }

    public Patient(String id_input, int age_input, BloodData blood_info)
    {
        Id=id_input;
        age=age_input;
        blood_data=blood_info;
    }

    public String getId() {
        return Id;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBlood_data() {
        return blood_data;
    }
}
