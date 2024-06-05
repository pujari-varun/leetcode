

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class Symmetric{
    public boolean isSymmetric(TreeNode root) {
        if(root==null){return true;}
        
        return isSameTree(root.left,root.right);
        
    }
    private boolean isSameTree(TreeNode x,TreeNode y){
        if(x==null && y==null){return true;}
        if (x == null || y == null) {
            return false;}

        if(x.val!=y.val){
            return false;
        }

        return isSameTree(x.left, y.right) && isSameTree(x.right, y.left);
        
    }
}