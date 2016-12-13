/**
 * Created by Rico on 12/13/2016.
 */
public class DemoBaseballGame {
    public static void main(String[] args)
    {
        BaseballGame game1 = new BaseballGame("One","Two");
        game1.setTeam1Score(0,10);
        game1.setTeam2SCore(2,100);
        game1.setTeam2SCore(0,20);
        System.out.println(game1.getTeam1Score(0));
        System.out.println(game1.getTeam2SCore(0));
        System.out.println(game1.getTeam1Name());
    }
}
