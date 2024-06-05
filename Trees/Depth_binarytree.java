public class Depth_binarytree {
    public int maxDepth(TreeNode root) {
        if(root==null){return 0;}
        // Queue<TreeNode> q=new LinkedList<>();
        // q.add(root);
        // int level=0;

        // while(!q.isEmpty()){
        //     int sizeofQ=q.size();
        //     int i=0;
        //     while(i<sizeofQ){
        //         TreeNode x=q.poll();
            
        //         if(x.left!=null){q.add(x.left);}
        //         if(x.right!=null){q.add(x.right);}
        //         i++;
        //     }
        //     level++;
        // }
        // return level;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return 1+Math.max(l,r);
    }
}
