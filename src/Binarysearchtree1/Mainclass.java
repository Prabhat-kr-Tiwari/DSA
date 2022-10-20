package Binarysearchtree1;
public class Mainclass {
    static boolean isPresent(Node root,int key)
    {
        if (root==null) return false;
        System.out.println(root.data);
        if (root.data==key) return true;
        if (key>root.data)
        {
            return isPresent(root.right,key);
        }
        return isPresent(root.left,key);
    }
    static boolean isPresentIterative(Node root,int key)
    {
        Node curr=root;

        while (curr!=null)
        {

            if (curr.data==key) return true;
            if (key>curr.data) curr=curr.right;
            else curr=curr.left;
        }
        return false;
    }

    public static void main(String[] args) {

        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(80);
        root.left.left=new Node(20);
        root.left.right=new Node(40);
        root.right.left=new Node(70);
        root.right.right=new Node(100);
        root.right.left.left=new Node(60);
        //System.out.println(isPresent(root,60));
        System.out.println(isPresentIterative(root,60));

    }

}
class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
    }
}
