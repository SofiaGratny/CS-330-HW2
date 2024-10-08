public class SilverBalls extends Decorator {
    Tree tree;

    public SilverBalls(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Silver Balls";
    }

    public double cost() {
        return tree.cost() + 3.0;
    }
}
