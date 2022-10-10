public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        tree.setRoot(new Node(8));
        tree.appendNode(6, null);
        tree.appendNode(3, null);
        tree.appendNode(7, null);
        tree.appendNode(16, null);
        tree.appendNode(13, null);
        tree.appendNode(23, null);
        tree.appendNode(14, null);
        tree.appendNode(12, null);
        System.out.println(tree.searchByValue(12, null));
    }
}
