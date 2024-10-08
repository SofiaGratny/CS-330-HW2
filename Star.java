public class Star extends Decorator {
    Tree tree;
    private static boolean hasStar = false;

    public Star(Tree tree) {
        this.tree = tree;
        if (hasStar) {
            System.out.println("Tree already has a star!");
        } else {
            hasStar = true;
        }
    }

    public String getDescription() {
        return tree.getDescription() + (hasStar ? "" : ", Star");
    }

    public double cost() {
        return hasStar ? tree.cost() : tree.cost() + 4.0;
    }
}
