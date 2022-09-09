package BinaryTree;
import java.util.Scanner;
public class BinaryTree {
    Scanner sc;
    Node root;
    public BinaryTree(){
        sc=new Scanner(System.in);
    }
    // create a binary tree ans return the root node
    Node CreateBinaryTree(){

        System.out.println("Enter node data");
        int data=sc.nextInt();
        if (data==-1) return null;
        Node node=new Node(data);
        System.out.println("Enter"+data+"s left data");
        node.left=CreateBinaryTree();
        System.out.println("Enter"+data+"s right data");
        node.right=CreateBinaryTree();
        return node;

    }
    void inOrderTraversal(Node root)
    {
        if (root==null) return;
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }
    void preOrderTraversal(Node root)
    {
        if (root==null) return;
        System.out.println(root.data);
        preOrderTraversal(root.left);

        preOrderTraversal(root.right);
    }
    int height(Node root)
    {
        if (root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;

    }
}
class Node{
    int data;
    Node left,right;
    public Node(int data)
    {
        this.data=data;
    }

}
