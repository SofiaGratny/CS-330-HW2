public class Ruffles extends Decorator {
    Tree tree;

    public Ruffles(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Ruffles";
    }

    public double cost() {
        return tree.cost() + 1.0;
    }
}
