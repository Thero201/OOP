import java.util.Objects;

public class Player extends Person {

    private int age;

    public Player(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    // getters
    public int getAge() {
        return age;
    }

    // setters
    public void setAge(int age) {
        this.age = age;
    }

    // polymorphism
    @Override
    public String getRole() {
        return "Player";
    }

    // toString
    @Override
    public String toString() {
        return "Player: " + name + ", age=" + age + " (id=" + id + ")";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return id == player.id &&
                age == player.age &&
                Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
