/**
 * Created by Rico on 12/13/2016.
 */
public class DemoHorses {
    public static void main(String[] args)
    {
        Horse horse1 = new Horse("Hari","Black",1997);
        System.out.println(horse1.getName());
        System.out.println(horse1.getColor());
        System.out.println(horse1.getBirthyear());
        RaceHorse horse2 = new RaceHorse("Nathan", "Yellow", 1998, 4);
        System.out.println(horse2.getName());
        System.out.println(horse2.getColor());
        System.out.println(horse2.getBirthyear());
        System.out.println(horse2.getNumberOfRaces());
    }
}
