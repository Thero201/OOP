public class Management {

    public void showClubInfo(SportsClub club) {
        System.out.println("=== Sports Club: " + club.getName() + " ===");

        System.out.println("Sports:");
        for (Sport sport : club.getSports()) {
            System.out.println("- " + sport);
        }

        System.out.println("Players:");
        for (Player player : club.getPlayers()) {
            System.out.println("- " + player);
        }
    }
}
