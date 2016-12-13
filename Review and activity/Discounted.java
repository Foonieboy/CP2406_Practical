/**
 * Created by Rico on 12/13/2016.
 */
public class Discounted {
    private String id;
    private String description;
    private double price;
    private double discount;

    Discounted(String id, String description, double price, double discount){
        this.id = id;
        this.description = description;
        this.price = price;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price*(1-discount);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String toString(){
        String allValue = "ID: " + id + " Description: " + description + " Price: " + price + " Discount: " + discount;
        return allValue;
    }
}
