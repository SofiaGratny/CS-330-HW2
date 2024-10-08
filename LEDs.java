public class LEDs extends Decorator {
    Tree tree;

    public LEDs(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", LEDs";
    }

    public double cost() {
        return tree.cost() + 10.0;
    }
}
