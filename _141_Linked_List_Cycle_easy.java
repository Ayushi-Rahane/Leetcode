
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode ptr1 = head; // one stepper
        ListNode ptr2 = head; // two stepper
        if(head==null){
            return false;
        }
        while(ptr2 !=null && ptr2.next != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if(ptr1 == ptr2){
                return true;
            }
        }
        return false;
    }
}
public class _141_Linked_List_Cycle_easy{
    public static void main(String[] args){

    }
}

