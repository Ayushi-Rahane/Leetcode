/*
  Definition for singly-linked list.*/
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public void mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1 = list1;
        while(ptr1.next !=null){
            ptr1 = ptr1.next;
        }
        ptr1.next = list2;
        ptr1 = list1;
       
        //sorting
        
        boolean swapped;
        int temp;
        do{
            ptr1 = list1;
            swapped = false;
            while(ptr1.next !=null){
                if(ptr1.val > ptr1.next.val){
                    temp = ptr1.val;
                    ptr1.val = ptr1.next.val;
                    ptr1.next.val = temp;
                    swapped = true;
                }
                ptr1 = ptr1.next;
            }
           
        }while(swapped);
          ptr1 = list1;
        while(ptr1!=null){
            System.out.println(ptr1.val);
            ptr1 = ptr1.next;

        }
    }

    
}
public class _21MergeTwoSortedLists {
    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Creating second sorted linked list: 2 -> 4 -> 6 -> null
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        Solution s = new Solution();
        s.mergeTwoLists(list1, list2);

    }
}
