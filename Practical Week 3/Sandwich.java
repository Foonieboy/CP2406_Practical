/**
 * Created by Rico on 11/29/2016.
 */
public class Sandwich {
    float TotalCalories;
    Bread bread;
    SandwichFilling filling;

    public Sandwich(String bread_type, float bread_calories, String sandwich_filling, float filling_calories)
    {
        bread = new Bread(bread_type, bread_calories);
        filling = new SandwichFilling(sandwich_filling,filling_calories);
        TotalCalories = count_calories(bread_calories,filling_calories);
    }

    public Bread getBread() {
        return bread;
    }

    public SandwichFilling getFilling() {
        return filling;
    }

    public float count_calories(float bread_calories, float filling_calories)
    {
        TotalCalories=bread_calories*2+filling_calories;
        return TotalCalories;
    }

    public float getTotalCalories()
    {
        return TotalCalories;
    }

}
