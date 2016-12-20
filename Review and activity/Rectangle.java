/**
 * Created by Rico on 12/20/2016.
 */
public class Rectangle extends Shape{
    private double width;

    public Rectangle(double length, double width)
    {
        super(length);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calArea()
    {
        return getLength()*width;
    }

    public String toString()
    {
        return super.toString() + " Width: " + width + " Area: " + calArea();
    }
}
