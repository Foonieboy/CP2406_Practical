/**
 * Created by Rico on 12/13/2016.
 */
public class BaseballGame {
    private String team1Name;
    private String team2Name;
    private int[] team1Score;
    private int[] team2Score;

    public BaseballGame(String team1Name, String team2Name)
    {
        this.team1Name = team1Name;
        this.team2Name = team2Name;
        this.team1Score = new int[9];
        for (int i = 0; i <team1Score.length;i++)
        {
            team1Score[i]= -1;
        }
        this.team2Score = new int[9];
        for (int i = 0; i <team2Score.length;i++)
        {
            team2Score[i]= -1;
        }
    }

    public String getTeam1Name() {
        return team1Name;
    }

    public void setTeam1Name(String team1Name) {
        this.team1Name = team1Name;
    }

    public String getTeam2Name() {
        return team2Name;
    }

    public void setTeam2Name(String team2Name) {
        this.team2Name = team2Name;
    }

    public int getTeam1Score(int inning) {
        return team1Score[inning];
    }

    public void setTeam1Score(int inning, int score) {
        if(inning<countInning(team1Score))
        {
            System.out.println("Cannot change inning score");
        }
        else
            if(inning>team1Score.length)
            {
                System.out.println("Game already over");
            }
            else
                if(inning>countInning(team1Score))
                {
                    System.out.println("Haven't reach that inning");
                }
                else
                {team1Score[inning] = score ;}
    }

    public int getTeam2SCore(int inning) {
        return team2Score[inning];
    }

    public void setTeam2SCore(int inning, int score) {
        if(inning<countInning(team2Score))
        {
            System.out.println("Cannot change inning score");
        }
        else
        if(inning>team2Score.length)
        {
            System.out.println("Game already over");
        }
        else
        if(inning>countInning(team2Score))
        {
            System.out.println("Haven't reach that inning");
        }
        else
        {team2Score[inning] = score ;}
    }

    public void add(String teamname, int score)
    {
        if(teamname.equals(team1Name))
        {
            setTeam1Score(countInning(team1Score), score);
        }
        else
        {
            setTeam2SCore(countInning(team2Score), score);
        }

    }

    public int countInning(int[] teamscore)
    {
        int counter = 0;
        for(int i = 0; i<teamscore.length; i++)
        {
            if (teamscore[i] != -1)
            {
                counter++;
            }
        }
        return counter;
    }
}

