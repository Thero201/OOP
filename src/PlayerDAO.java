import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerDAO {

    // CREATE
    public static void addPlayer(Player player) {
        String sql = "INSERT INTO players (name, age) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, player.getName()); // 1-й ?
            ps.setInt(2, player.getAge());     // 2-й ?

            ps.executeUpdate();
            System.out.println("Player added successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    public static void getAllPlayers() {
        String sql = "SELECT * FROM players";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " | " + name + " | " + age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public static void updatePlayerAge(int id, int newAge) {
        String sql = "UPDATE players SET age = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, newAge);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Player updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public static void deletePlayer(int id) {
        String sql = "DELETE FROM players WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Player deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
