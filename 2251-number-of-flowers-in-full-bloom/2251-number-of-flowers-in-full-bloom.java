class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n=flowers.length;
        int start[]=new int[n];
        int end[]=new int[n];

        for(int i=0;i<n;i++){
            start[i]=flowers[i][0];
            end[i]=flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int ans[]=new int[people.length];
        for(int i=0;i<people.length;i++){
            int time=people[i];
            int s=upperBound(start,time);
            int e=lowerBound(end,time);
            ans[i]=s-e;
        }
        return ans;  
    }
  // Number of elements <= target
    public int upperBound(int[] arr, int target) {

        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

   
    public int lowerBound(int[] arr, int target) {

        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
