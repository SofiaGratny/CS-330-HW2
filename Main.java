public class Main {
    public static void main(String[] args) {
        Tree mytree = new BlueSpruce(); 
        mytree = new Star(mytree); 
        mytree = new Ruffles(mytree); 
        mytree = new Star(mytree); 
        mytree = new Ribbons(mytree); 
        mytree = new Lights(mytree); 

        System.out.println(mytree.getDescription() + " costs $" + mytree.cost());
    }
}
