/**
 * Created by Rico on 11/29/2016.
 */
public class SandwichFilling {
    private String Filling;
    private float Calories;

    public SandwichFilling(String filling_type, float calories_per_slice)
    {
        Filling=filling_type;
        Calories=calories_per_slice;
    }

    public String getFilling() {
        return Filling;
    }

    public float getCalories() {
        return Calories;
    }
}
