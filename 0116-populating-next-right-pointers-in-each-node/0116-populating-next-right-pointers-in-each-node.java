class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        Node leftnode=root;

        while(leftnode.left!=null){
            Node head=leftnode;
            while(head!=null){
                head.left.next=head.right;

                if(head.next!=null){
                    head.right.next=head.next.left;
                }
                head=head.next;
            }
            leftnode=leftnode.left;
        }
        return root;
        
    }
}