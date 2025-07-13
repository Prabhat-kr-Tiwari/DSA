package rbAnjaliCodes.ProblemOfDay13072025;

import java.util.*;

//TopViewofBinaryTree
public class BinaryTree {
    Scanner sc;


    public BinaryTree() {
        sc = new Scanner(System.in);
    }

    Node createBinaryTree() {
        System.out.println("Enter node data");
        int data = sc.nextInt();
        if (data == -1) return null;
        Node node = new Node(data);
        System.out.println("Enter" + data + "s left data");
        node.left = createBinaryTree();
        System.out.println("Enter" + data + "s right data");
        node.right = createBinaryTree();
        return node;

    }

    void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }

    static class Pair {
        int heightDifference;
        Node node;

        public Pair(int heightDifference, Node node) {
            this.heightDifference = heightDifference;
            this.node = node;

        }

    }

    static ArrayList<Integer> topView(Node root) {
        // code here
        Queue<Pair> queue = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        queue.add(new Pair(0, root));
        while (!queue.isEmpty()) {
            Pair currentPair = queue.poll();
            if (!map.containsKey(currentPair.heightDifference)) {
                map.put(currentPair.heightDifference, currentPair.node.data);
            }
            if (currentPair.node.left != null) {
                queue.add(new Pair(currentPair.heightDifference - 1, currentPair.node.left));
            }
            if (currentPair.node.right != null) {
                queue.add(new Pair(currentPair.heightDifference + 1, currentPair.node.right));
            }

        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;


    }

    static ArrayList<Integer> bottomView(Node root) {
        // Code here
        Queue<Pair> queue = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        queue.add(new Pair(0, root));
        while (!queue.isEmpty()) {
            Pair currentpair = queue.poll();
            map.put(currentpair.heightDifference, currentpair.node.data);
            if (currentpair.node.left != null) {
                queue.add(new Pair(currentpair.heightDifference - 1, currentpair.node.left));
            }
            if (currentpair.node.right != null) {
                queue.add(new Pair(currentpair.heightDifference + 1, currentpair.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }


}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;

    }
}
