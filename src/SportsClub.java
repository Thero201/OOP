import java.util.*;
import java.util.stream.Collectors;

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

    // Add methods
    public void addSport(Sport sport) {
        sports.add(sport);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    // Filtering
    public List<Player> getPlayersOlderThan(int age) {
        return players.stream()
                .filter(p -> p.getAge() > age)
                .collect(Collectors.toList());
    }

    // Searching
    public Player findPlayerByName(String name) {
        for (Player p : players) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Sorting
    public List<Player> getPlayersSortedByAge() {
        return players.stream()
                .sorted(Comparator.comparingInt(Player::getAge))
                .collect(Collectors.toList());
    }

    public void showClubInfo() {
        System.out.println("=== Sports Club: " + name + " ===");

        System.out.println("Sports:");
        sports.forEach(System.out::println);

        System.out.println("Players:");
        players.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "SportsClub{name='" + name + "'}";
    }
}
