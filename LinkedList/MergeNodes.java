package LinkedList;

public class MergeNodes {
    public ListNode mergeNodes(ListNode head) {
        ListNode node=head;
        while(node.next!=null){

            if(node.val==0){
                ListNode h=node.next;
                while(h.val!=0){
                    node.val=node.val+h.val;
                    h=h.next;
                }
                if(h.next==null){node.next=null;break;}
                else{node.next=h;}
            }
            
            node=node.next;
           
        }
        return head;
    }
    
}


