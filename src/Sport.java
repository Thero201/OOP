import java.util.Objects;

public class Sport {
    private int id;
    private String name;

    public Sport(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return "Sport: " + name + " (id=" + id + ")";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sport)) return false;
        Sport sport = (Sport) o;
        return id == sport.id && Objects.equals(name, sport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
