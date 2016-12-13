public class DiscountedProduct extends Product {
    private double discount;
    public DiscountedProduct(String id, String description, double price, double discount){
        super(id,description,price);
        this.discount = discount;
    }
    public double getDiscount()
    {
        return discount;
    }
    public void setDiscount(double discount)
    {
        this.discount = discount;
    }
    public String toString(){
        return super.toString()+ " Discount: " + discount;
    }
    public double getPrice(){
        return super.getPrice()*(1-discount);
    }
}