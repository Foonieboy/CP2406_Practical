/**
 * Created by Rico on 11/29/2016.
 */
public class BloodData {
    private String blood_type;
    private String Rh;

    public BloodData()
    {
        blood_type = "O";
        Rh = "+";
    }

    public BloodData(String blood_model, String Rh_type)
    {
        blood_type = blood_model;
        Rh=Rh_type;
    }

    public String getBlood_type()
    {
        return blood_type;
    }
    public void setBlood_type(String blood_model)
    {
        blood_type = blood_model;
    }
    public String getRh()
    {
        return Rh;
    }
    public void setRh(String Rh_type)
    {
        Rh = Rh_type;
    }
}
