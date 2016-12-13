/**
 * Created by Rico on 12/13/2016.
 */
public class DiscountedProductTest {
    public static void main(String[] args){
        Product test1 = new Product("HEHEHE","hah", 3.00);
        System.out.println(test1.toString());
        DiscountedProduct p = new DiscountedProduct("p001", "Shoe", 123.5, 0.2);
        System.out.println(p.getId());
        System.out.println(p.toString());
    }
}
