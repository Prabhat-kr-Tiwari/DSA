package BinaryTree;

public class MainClass {
    public static void main(String[] args) {

        BinaryTree binaryTree=new BinaryTree();
        Node root=binaryTree.CreateBinaryTree();

        //binaryTree.inOrderTraversal(root);
        System.out.println("preorder");
        binaryTree.preOrderTraversal(root);
        System.out.println("height");
        System.out.println(binaryTree.height(root));



    }
}
