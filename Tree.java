public abstract class Tree {
    public String description = "Unknown Tree";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
