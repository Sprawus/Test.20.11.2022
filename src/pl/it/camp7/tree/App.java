package pl.it.camp7.tree;

public class App {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(6);
        tree.add(10);
        tree.add(7);
        tree.add(2);
        System.out.println(tree.maximum());
        System.out.println(tree.minimum());
        System.out.println(tree.contains(8));
    }
}

