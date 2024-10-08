public class RedBalls extends Decorator {
    Tree tree;

    public RedBalls(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Red Balls";
    }

    public double cost() {
        return tree.cost() + 1.0;
    }
}
