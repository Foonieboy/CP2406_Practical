/**
 * Created by Rico on 11/29/2016.
 */
public class Bread {
    private String bread;
    private float calories;

    public final static String MOTTO = "The staff of life";

    public Bread (String bread_type, float calories_per_slice)
    {
        bread=bread_type;
        calories=calories_per_slice;
    }

    public String getBread() {
        return bread;
    }

    public float getCalories() {
        return calories;
    }

    public static String getMOTTO() {
        return MOTTO;
    }
}
