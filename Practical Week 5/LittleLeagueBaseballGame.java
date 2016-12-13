/**
 * Created by Rico on 12/13/2016.
 */
public class LittleLeagueBaseballGame extends BaseballGame {
    public LittleLeagueBaseballGame(String team1Name, String team2Name) {
        super(team1Name, team2Name);
    }
    public void setTeam1Score(int inning, int score) {
        if(inning>5)
        {
            System.out.println("No inning "+ inning);}
        else
        {super.setTeam1Score(inning, score);}
    }
    public void setTeam2SCore(int inning, int score) {
        if (inning > 5)
        {System.out.println("No inning "+ inning);}
        else {
            super.setTeam2SCore(inning,score);
        }
    }
}
