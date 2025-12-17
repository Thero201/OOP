public class Sport {
    private int id;
    private String name;

    public Sport(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sport: " + name;
    }
}
