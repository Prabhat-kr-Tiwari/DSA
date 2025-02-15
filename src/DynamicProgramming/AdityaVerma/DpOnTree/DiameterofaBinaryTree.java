package DynamicProgramming.AdityaVerma.DpOnTree;

import java.util.Scanner;

// Node class representing a single node in the binary tree
class Node {
    int data;
   Node left, right;

    public Node(int data) {
        this.data = data;
    }

    // Method to create a binary tree recursively
    static Node createBinaryTree(Scanner sc) {
        System.out.println("Enter node data (-1 for null): ");
        int data = sc.nextInt();
        if (data == -1) return null; // Base case for null node
        Node node = new Node(data);
        System.out.println("Enter left child of " + data);
        node.left = createBinaryTree(sc);
        System.out.println("Enter right child of " + data);
        node.right = createBinaryTree(sc);
        return node;
    }
}

public class DiameterofaBinaryTree {

    static int res = Integer.MIN_VALUE; // Global variable to store the maximum diameter

    // Method to calculate the height of the tree and update the diameter
    static int solve(Node node) {
        if (node == null) {
            return 0; // Base case: height of a null node is 0
        }
        int l = solve(node.left); // Recursive call for the left subtree
        int r = solve(node.right); // Recursive call for the right subtree

        // Calculate the diameter at the current node
        int temp = Math.max(l, r) + 1; // Height of the current node
        int ans = Math.max(temp, 1 + l + r); // Diameter through the current node
        res = Math.max(res, ans); // Update the global maximum diameter
        return temp; // Return height to parent node
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create the binary tree
        System.out.println("Create the binary tree:");
  Node root = Node.createBinaryTree(sc);

        // Calculate the diameter of the binary tree
        solve(root);
        System.out.println("The diameter of the binary tree is: " + res);
        System.out.println("The diameter of the binary tree is: " + (res-1));

        sc.close(); // Close the scanner
    }
}
