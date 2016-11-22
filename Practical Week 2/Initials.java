/**
 * Created by Rico on 11/22/2016.
 */
public class Initials {
    private String name;
    public void displayInitials(String name)
    {
        String [] nameComponent = name.split(" ");
        char first = nameComponent[0].charAt(0);
        char second = nameComponent[1].charAt(0);
        char third = nameComponent[2].charAt(0);
        System.out.println(first + "," + second + "," + third);
    }

}
