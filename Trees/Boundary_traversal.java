// Problem Statement: 
// Given a Binary Tree, perform the boundary traversal of the tree. The boundary traversal is the process of visiting the boundary nodes of the binary tree in the anticlockwise direction, starting from the root.
import java.util.ArrayList;
import java.util.Stack;
class Node{
    int val;
    Node left;
    Node right;
    Node(){
        this.val=0;
        this.left=null;
        this.right=null;
    }
    Node(int v){
        this.val=v;
        this.left=null;
        this.right=null;
    }
    Node(int v,Node l,Node r){
        this.val=v;
        this.left=l;
        this.right=r;
    }
}
public class Boundary_traversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right.right.left = new Node(10);
        root.right.right.right = new Node(11);

        ArrayList<Integer> boundaryNodes = traversal(root);
        System.out.println("Boundary Traversal: " + boundaryNodes);
        
    }
    public static ArrayList<Integer> traversal(Node root){
        ArrayList<Integer> result=new ArrayList<>();
        result.add(root.val);
        Node temp=root.left;
        while(temp!=null ){
            if(temp.left!=null || temp.right!=null)
                result.add(temp.val);
            if(temp.left!=null){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
        Stack<Node> stack=new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current.left == null && current.right == null) {
                result.add(current.val);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        temp=root.right;
        while(temp!=null){
            if(temp.left!=null || temp.right!=null)
                stack.add(temp);
            if(temp.right!=null){
                temp=temp.right;
            }
            else {
                temp=temp.left;
            }
        }
        while(!stack.isEmpty()){
            result.add(stack.pop().val);
        }
        return result;
    }
}
