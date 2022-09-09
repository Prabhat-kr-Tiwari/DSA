package BinaryTreeProblem1;
import javax.swing.tree.TreeNode;
import java.util.*;

public class levelordertraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.offer(null);
        ArrayList<Integer> currList=new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(curr==null)
            {
                ans.add(currList);
                if(q.isEmpty()) return ans;
                q.offer(null);
                currList=new ArrayList<>();
            }
            else{
                currList.add(curr.val);
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }if(curr.right!=null)
                {
                    q.add(curr.right);
                }

            }
        }
        return ans;
    }
}
