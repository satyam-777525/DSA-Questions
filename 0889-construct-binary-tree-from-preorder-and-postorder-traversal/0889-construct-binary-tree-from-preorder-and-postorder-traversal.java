
class Solution {
    public TreeNode build(int []preorder,int prelow,int prehigh,int []postorder,int postlow,int posthigh){
        if(prelow>prehigh) return null;
        TreeNode root=new TreeNode(preorder[prelow]);
        if(prelow==prehigh) return root;
        int leftroot=preorder[prelow+1];

        int i=postlow;
        while(postorder[i]!=leftroot){
            i++;
        }
        int leftsize=i-postlow+1;

        root.left=build(preorder,prelow+1,prelow+leftsize,postorder,postlow,i);
        root.right=build(preorder,prelow+leftsize+1,prehigh,postorder,i+1,posthigh-1);

        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return build(preorder,0,preorder.length-1,postorder,0,postorder.length);
        
    }

}