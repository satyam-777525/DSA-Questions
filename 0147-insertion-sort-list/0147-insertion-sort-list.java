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
    public ListNode insertionSortList(ListNode head) {
        List<Integer> res=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            res.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(res);
        ListNode ans=new ListNode(0);
        ListNode temp1=ans;
        for(int x:res){
            ListNode a=new ListNode(x);
            temp1.next=a;
            temp1=temp1.next;
        }
        return ans.next;
    }
}