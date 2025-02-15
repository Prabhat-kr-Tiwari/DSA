package DynamicProgramming.AdityaVerma.DpOnTree.MaximumPathSumOfABinaryTreeFromLeafToLeaf;

import java.util.Scanner;

// Node class representing a single node in the binary tree
class Node1 {
    int data;
    Node1 left, right;

    public Node1(int data) {
        this.data = data;
    }

    // Method to create a binary tree recursively
    static Node1 createBinaryTree(Scanner sc) {
        System.out.println("Enter node data (-1 for null): ");
        int data = sc.nextInt();
        if (data == -1) return null; // Base case for null node
        Node1 node = new Node1(data);
        System.out.println("Enter left child of " + data);
        node.left = createBinaryTree(sc);
        System.out.println("Enter right child of " + data);
        node.right = createBinaryTree(sc);
        return node;
    }
}

public class MaximumPathSumofaBinaryTree {

    static int res = Integer.MIN_VALUE; // Global variable to store the maximum diameter

    // Method to calculate the height of the tree and update the diameter
    static int solve(Node1 node) {
        if (node == null) {
            return 0; // Base case: height of a null node is 0
        }
        int l = solve(node.left); // Recursive call for the left subtree
        int r = solve(node.right); // Recursive call for the right subtree

        // Calculate the diameter at the current node
        int temp =Math.max(l, r) + node.data; // Height of the current node
        if(node.left==null&&node.right==null){
            temp=Math.max(temp,node.data);
        }
        int ans = Math.max(temp,  l + r+node.data); // Diameter through the current node
        res = Math.max(res, ans); // Update the global maximum diameter
        return temp; // Return height to parent node
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create the binary tree
        System.out.println("Create the binary tree:");
        Node1 root = Node1.createBinaryTree(sc);

        // Calculate the diameter of the binary tree
        solve(root);
        System.out.println("The diameter of the binary tree is: " + res);
        System.out.println("The diameter of the binary tree is: " + (res-1));

        sc.close(); // Close the scanner
    }
}
