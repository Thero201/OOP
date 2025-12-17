import java.util.ArrayList;
import java.util.List;

public class SportsClub {
    private String name;
    private List<Sport> sports = new ArrayList<>();
    private List<Player> players = new ArrayList<>();

    public SportsClub(String name) {
        this.name = name;
    }

    public void addSport(Sport sport) {
        sports.add(sport);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Sport> getSports() {
        return sports;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }
}
