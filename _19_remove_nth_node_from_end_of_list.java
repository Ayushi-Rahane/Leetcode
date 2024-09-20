/**
Definition for singly-linked list. */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0,size;
        ListNode ptr =head;
        while(ptr != null){
            len++;
            ptr = ptr.next;
        }
        
        if(len==1 || len==0){
            return head=null;
        }
        else if(len==n){
            head = head.next;
        }
        else{
            size = len-n;
            ptr = head;
            for(int i=1;i<size;i++){
                ptr = ptr.next;
            }
            ptr.next = ptr.next.next;
        }
        
        return head;

    }
}

public class _19_remove_nth_node_from_end_of_list{
    public static void main(String[] args){
        // ListNode node5 = new ListNode(5, null);
        // ListNode node4 = new ListNode(4, node5);
        //ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, null);
        ListNode head = new ListNode(1, node2);
        Solution solution = new Solution();
        int n = 1;  
        head = solution.removeNthFromEnd(head, n);

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.print("null"); 
    }
}