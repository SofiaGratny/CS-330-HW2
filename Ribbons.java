public class Ribbons extends Decorator {
    Tree tree;

    public Ribbons(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Ribbons";
    }

    public double cost() {
        return tree.cost() + 2.0;
    }
}
