package rbAnjaliCodes.ProblemOfDay13072025;

import static rbAnjaliCodes.ProblemOfDay13072025.BinaryTree.bottomView;
import static rbAnjaliCodes.ProblemOfDay13072025.BinaryTree.topView;

public class MainClass {
    public static void main(String[] args) {

        BinaryTree binaryTree=new BinaryTree();
        Node root=binaryTree.createBinaryTree();
        System.out.println(topView(root));
        System.out.println(bottomView(root));

        //binaryTree.inOrderTraversal(root);
        System.out.println("inorder");
        binaryTree.inorderTraversal(root);




    }
}
