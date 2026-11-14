class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int mod=1000000007;
        Arrays.sort(arr);
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            if(!map.containsKey(x)){
                map.put(x,new ArrayList<>());
            }
            map.get(x).add(i);
        }
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int x=arr[i];
                int y=arr[j];
                int need=target-(x+y);
                if(map.containsKey(need)){
                    List<Integer> list= map.get(need);
                    int pos = upperBound(list,j);
                    count += list.size()-pos;
                    count%=mod;
                }
            }
        }
        return (int)count%mod;
    }
    private int upperBound(List<Integer> list,int target){

        int low=0;
        int high=list.size()-1;
        int ans=list.size();

        while(low<=high){

            int mid=(low+high)/2;

            if(list.get(mid)>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }
}
// 1 1
// 1 2 5- 2
// 1 2 5- 2
// 1 3 4- 2
// 1 3 4- 2
// 1 2 5-2
// 1 2 5-2
// 1 3 4-2
// 1 3 4-2
// 2 2 4-2
