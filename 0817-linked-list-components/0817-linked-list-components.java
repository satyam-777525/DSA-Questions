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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums) set.add(x);
        int count=0;
        ListNode temp=head;
        boolean t=false;
        while(temp!=null){
            if(set.contains(temp.val)){
                if(!t){
                    count++;
                    t=true;
                }
            }else{
                t=false;
            }
            temp=temp.next;
        }
        return count;
    }
}