import java.util.ArrayList;
import java.util.List;

public class SportsClub {
    private String name;
    private List<Sport> sports = new ArrayList<>();
    private List<Player> players = new ArrayList<>();

    public SportsClub(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Sport> getSports() {
        return sports;
    }

    public List<Player> getPlayers() {
        return players;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    // Методы добавления
    public void addSport(Sport sport) {
        sports.add(sport);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    // toString
    @Override
    public String toString() {
        return "SportsClub: " + name + ", Sports=" + sports + ", Players=" + players;
    }
}
