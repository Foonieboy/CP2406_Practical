/**
 * Created by Rico on 12/13/2016.
 */
public class Horse {
    private String name;
    private String color;
    private int birthyear;

    public Horse(String name, String color, int birthyear)
    {
        this.name = name;
        this.color = color;
        this.birthyear = birthyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }
}
