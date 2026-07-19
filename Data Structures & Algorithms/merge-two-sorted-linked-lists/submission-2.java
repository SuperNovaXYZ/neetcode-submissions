/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


            ListNode completedList = new ListNode(Integer.MIN_VALUE);

            ListNode headNode= completedList;

            while (list1 !=null && list2 !=null){
                
                if(list1.val <= list2.val){
                    completedList.next= list1;
                    list1=list1.next;
                } else if(list1.val >= list2.val){
                    completedList.next= list2;
                    list2=list2.next;
                }
            
            completedList= completedList.next;
               


            }

            if(list1 ==null){
                completedList.next= list2;
            }else{
                completedList.next=list1;
            }


         return headNode.next;
    }
}