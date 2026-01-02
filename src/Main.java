import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SportsClub club = new SportsClub("Astana Sports Club");

        Sport football = new Sport(1, "Football");
        Sport tennis = new Sport(2, "Tennis");

        Player rakhat = new Player(1, "Rakhat", 18);
        Player rauan = new Player(2, "Rauan", 15);
        Player anotherRakhat = new Player(1, "Rakhat", 18);

        club.addSport(football);
        club.addSport(tennis);

        club.addPlayer(rakhat);
        club.addPlayer(rauan);

        club.showClubInfo();


        System.out.println("\nСравнение игроков:");
        System.out.println("rakhat.equals(anotherRakhat)? " + rakhat.equals(anotherRakhat));

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter new player name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        Player newPlayer = new Player(3, name, age);
        club.addPlayer(newPlayer);

        System.out.println("\nAfter adding new player:");
        club.showClubInfo();

        scanner.close();

    }
}
