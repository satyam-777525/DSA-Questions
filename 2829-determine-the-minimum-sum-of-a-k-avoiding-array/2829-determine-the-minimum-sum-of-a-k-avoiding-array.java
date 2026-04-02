class Solution {
    public int minimumSum(int n, int k) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        int x=1;
        while(n>0){
            if(!set.contains(k-x)){
                sum+=x;
                set.add(x);
                n--;
            }
            x++;
        }
        return sum;
    }
}