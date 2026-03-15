
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n=nums.length;
        TreeNode root=treeBnade(nums,0,n-1);
        return root;
    }
    public TreeNode treeBnade(int arr[],int left,int right){
        if(left>right) return null;
    
        int idx=maxbtade(arr,left,right);
        TreeNode root=new TreeNode(arr[idx]);

        root.left=treeBnade(arr,left,idx-1);
        root.right=treeBnade(arr,idx+1,right);

        return root;
    }
    public int maxbtade(int arr[],int st,int end){
        int maxindex=st;
        for(int i=st;i<=end;i++){
            if(arr[i]>arr[maxindex]){
                maxindex=i;
            }
        }
        return maxindex;
    }
}