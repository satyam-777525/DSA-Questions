// class Solution {
//     public long findKthSmallest(int[] coins, int k) {
//         int count=0;
     
//         int min=Arrays.stream(coins).min().getAsInt();
//         for(long i=min;;i++){
//             for(int x:coins){
//                 if(i%x==0){
//                     count++;
                    
//                     break;
//                 }
//             }
//             if(count==k){
//                 return i;
//             }
//         }
        
//     }
// }
class Solution {

    public long findKthSmallest(int[] coins, int k) {

        long left = 1;
        long right = (long) k * coins[0];

        for (int coin : coins) {
            right = Math.min(right, (long) k * coin);
        }

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (count(mid, coins) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private long count(long x, int[] coins) {

        int n = coins.length;
        long ans = 0;

        for (int mask = 1; mask < (1 << n); mask++) {

            long lcm = 1;
            int bits = 0;

            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {

                    bits++;

                    lcm = lcm(lcm, coins[i]);

                    if (lcm > x) {
                        break;
                    }
                }
            }

            if (lcm > x) continue;

            long current = x / lcm;

            if (bits % 2 == 1) {
                ans += current;
            } else {
                ans -= current;
            }
        }

        return ans;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private long gcd(long a, long b) {

        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}