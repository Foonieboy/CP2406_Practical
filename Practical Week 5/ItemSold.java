/**
 * Created by Rico on 12/13/2016.
 */
public class ItemSold {
    private int number;
    private String description;
    private double price;

    public ItemSold(int number, String description, double price)
    {
        this.number=number;
        this.description=description;
        this.price=price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
