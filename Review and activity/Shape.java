/**
 * Created by Rico on 12/20/2016.
 */
public abstract class Shape {
    private double length;

    public Shape(double length)
    {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public abstract double calArea();

    public String toString()
    {
        return "Length: " + getLength();
    }
}
