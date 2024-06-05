
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head){
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.val== curr.next.val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }    

    public static void main(String[] args) {
        ListNode root=new ListNode(1);
        root.next=new ListNode(1);
        root.next.next=new ListNode(2);
        RemoveDuplicates remover= new RemoveDuplicates();
        root=remover.deleteDuplicates(root);
        System.out.println(root.val);
        System.out.println(root.next.val);
        
    }

}
