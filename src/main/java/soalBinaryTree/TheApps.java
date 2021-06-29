package soalBinaryTree;
public class TheApps {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        Node siNode;
        
        siNode = new Node(60);
        tree.insert(siNode);
        
        siNode = new Node(40);
        tree.insert(siNode);
        
        siNode = new Node(30);
        tree.insert(siNode);
        
        siNode = new Node(50);
        tree.insert(siNode);
        
        siNode = new Node(80);
        tree.insert(siNode);
        
        
        

        System.out.print("\nTraversal dengan inOrder: ");
        tree.inOrder();
        System.out.print("\nTraversal dengan preOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postOrder: ");
        tree.postOrder();
    }
}