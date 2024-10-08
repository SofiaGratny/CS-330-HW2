public class Lights extends Decorator {
    Tree tree;

    public Lights(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Lights";
    }

    public double cost() {
        return tree.cost() + 5.0;
    }
}
