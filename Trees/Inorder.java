import java.util.ArrayList;
import java.util.List;

public class Inorder{
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> x=new ArrayList<>();
        inorder(root,x);
        return x;

        
    }
    void inorder(TreeNode root,List<Integer> x){
        if(root==null){return;}
        inorder(root.left,x);
        x.add(root.val);
        inorder(root.right,x);
    }
}
class TreeNode{
    int val;
    TreeNode left=null;
    TreeNode right=null;
    TreeNode(){}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
    }

}