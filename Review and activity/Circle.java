/**
 * Created by Rico on 12/20/2016.
 */
public class Circle extends Shape{

    public Circle(double radius)
    {
        super(radius);
    }

    public double calArea()
    {
        return getLength()*getLength()*Math.PI;
    }

    public String toString()
    {
        return "Radius :" + getLength();
    }
}
