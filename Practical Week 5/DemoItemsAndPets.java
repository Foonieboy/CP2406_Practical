/**
 * Created by Rico on 12/13/2016.
 */
public class DemoItemsAndPets {
    public static void main(String[] args)
    {
        ItemSold item1 = new ItemSold(102, "A good doge", 200);
        System.out.println(item1.getNumber());
        System.out.println(item1.getDescription());
        System.out.println(item1.getPrice());
        PetSold doge1 = new PetSold(item1.getNumber(),item1.getDescription(),item1.getPrice(),true,true,false);
        System.out.println(doge1.getNumber());
        System.out.println(doge1.getDescription());
        System.out.println(doge1.getPrice());
        System.out.println(doge1.isVaccinated());
        System.out.println(doge1.isNeutered());
        System.out.println(doge1.isHouseBroken());
        doge1.setHouseBroken(true);
        System.out.println(doge1.isHouseBroken());

    }
}
