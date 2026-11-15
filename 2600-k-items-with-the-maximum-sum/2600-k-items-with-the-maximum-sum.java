class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int count=0;
        if(numOnes>=k){
            return k;
        }else{
            count+=numOnes;
            k=k-numOnes;
        }
        if(numZeros>=k){
            return count;
        }else{
            k=k-numZeros;
        }
        if(numNegOnes>=k){
            count-=k;
        }
        return count;
    }
}