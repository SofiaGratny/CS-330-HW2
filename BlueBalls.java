public class BlueBalls extends Decorator {
    Tree tree;

    public BlueBalls(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Blue Balls";
    }

    public double cost() {
        return tree.cost() + 2.0;
    }
}
