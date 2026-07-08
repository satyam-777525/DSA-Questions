// class Solution {
//     public int[] sumAndMultiply(String s, int[][] queries) {
//         final int MOD = 1_000_000_007;
//         int n=queries.length;
//         int ans[]=new int[n];
//         int l=s.length();
//         String [] str=new String[l];
//         str[0]=(s.charAt(0)=='0')?"":String.valueOf(s.charAt(0));
//         for(int i=1;i<s.length();i++){
//             if(s.charAt(i)!='0'){
//                 str[i]=str[i-1]+s.charAt(i);
//             }else{
//                 str[i]=str[i-1];
//             }
            
//         }
//         int sum[]=new int[l];
//         sum[0]= s.charAt(0)-'0';
//         for(int i=1;i<s.length();i++){
//             if(s.charAt(i)!='0'){
//                 int x=s.charAt(i)-'0';
//                 sum[i]=sum[i-1]+x;
//             }else{
//                 sum[i]=sum[i-1];
//             }
//         }
//         int i=0;
//         for(int[]q:queries){
//             String x=str[q[1]];
//             int idx=-1;
            
//             if(q[0]>0){
//             String remove=str[q[0]-1];
//              idx = x.indexOf(remove);
//              if (idx!=-1) {
//                     x = x.substring(0,idx)+x.substring(idx+remove.length());
//                 }
//             }
//             long g = 0;
//             for (int j =0;j<x.length();j++){
//                     g =(g*10+(x.charAt(j)-'0'))%MOD;
//             }
//             int mul=0;
//             if(q[0]>0){
//                 mul=sum[q[1]]-sum[q[0]-1];
//             }else{
//                 mul=sum[q[1]];
//             }
//             ans[i] =(int)(((long) g*mul)%MOD);
//             i++;

//         }
//         return ans;
//     }
// }
// // 0 1  2  3   4   5   6   7
// // 1 0  2  0   3   0   0   4
// // 1 1 12 12 123 123 123 1234
// // 1 1  3  3   6   6   6   10

class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        final int MOD = 1_000_000_007;

        int n = s.length();
        int m = queries.length;
        int[] ans = new int[m];

        // cnt[i] = number of non-zero digits in s[0...i-1]
        int[] cnt = new int[n + 1];

        // prefix sum of non-zero digits
        long[] sum = new long[n + 1];

        // prefix concatenated number modulo MOD
        long[] num = new long[n + 1];

        // powers of 10 modulo MOD
        long[] pow = new long[n + 1];
        pow[0] = 1;

        int k = 0;

        for (int i = 0; i < n; i++) {
            cnt[i + 1] = cnt[i];

            if (s.charAt(i) != '0') {
                int d = s.charAt(i) - '0';

                k++;
                cnt[i + 1]++;

                sum[k] = sum[k - 1] + d;
                num[k] = (num[k - 1] * 10 + d) % MOD;
            }
        }

        for (int i = 1; i <= k; i++) {
            pow[i] = (pow[i - 1] * 10) % MOD;
        }

        for (int i = 0; i < m; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            int left = cnt[l];
            int right = cnt[r + 1];

            long mul = sum[right] - sum[left];

            int len = right - left;

            long g = (num[right] - num[left] * pow[len] % MOD + MOD) % MOD;

            ans[i] = (int) ((g * (mul % MOD)) % MOD);
        }

        return ans;
    }
}