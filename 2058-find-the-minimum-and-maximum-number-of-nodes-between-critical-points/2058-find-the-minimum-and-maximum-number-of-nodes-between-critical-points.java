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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev=head;
        ListNode curr=head.next;
        int i=1;
        int prevposition=0;
        int firstposition=0;
        int mindist=Integer.MAX_VALUE;
        while(curr.next!=null&&curr!=null){
          if (prev.val < curr.val && curr.val > curr.next.val || prev.val > curr.val && curr.val < curr.next.val) {
                if(prevposition==0){
                    prevposition=i;
                    firstposition=i;
                }
                else{
                    mindist=Math.min(mindist,i-prevposition);
                    prevposition=i;
                }
            }
            i++;
            prev=curr;
            curr=curr.next;
        }
        if(mindist==Integer.MAX_VALUE){
            return new int[]{-1, -1};
        }
        return new int []{mindist,prevposition-firstposition};
        
    }
}