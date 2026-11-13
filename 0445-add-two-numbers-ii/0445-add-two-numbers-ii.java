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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode one=reverse(l1);
        ListNode two=reverse(l2);
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(one!=null||two!=null||carry!=0){
            int sum=carry;
            if(one!=null){
                sum+=one.val;
                one=one.next;
            }
            if(two!=null){
                sum+=two.val;
                two=two.next;
            }
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;

        }
        ListNode ans=reverse(dummy.next);
        return ans;
    }
    public ListNode reverse(ListNode root){
        ListNode prev=null;
        ListNode curr=root;
        ListNode agla=null;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
}