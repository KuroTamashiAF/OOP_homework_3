package ObjectClasses;

public class Items {
    private String name;
    private int weight;

    public Items(String nam, int weight) {
        this.name = nam;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return String.format("%s", name );
    }
}
