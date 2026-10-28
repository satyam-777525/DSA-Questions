// this will pass 936 out of 999 but give tle
// class Solution {
//     int n;
//     int m;
//     int ans;
//     HashSet<String> visited;
//     public int minCost(int[][] grid) {
//         n=grid.length;
//         m=grid[0].length;
//          ans=Integer.MAX_VALUE;
//          visited=new HashSet<>();
//          helper(0,0,0,grid);
//          return ans;
//     }
//     public void helper(int i,int j,int xor,int [][]grid){
//         if(i<0 ||j<0||i>=n||j>=m){
//             return;
//         }
//         xor=xor^grid[i][j];
//         if(i==n-1&&j==m-1){
//             ans=Math.min(ans,xor);
//             return;
//         }
//         String key = i + "," + j + "," + xor;

//         if (visited.contains(key)) {
//             return;
//         }

//         // visited.add(key);
//         helper(i+1,j,xor,grid);
//         helper(i,j+1,xor,grid);
//     }
// }


import java.util.*;

class Solution {
    int n, m;
    Set<Integer>[][] dp;

    public int minCost(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        dp = new HashSet[n][m];

        Set<Integer> result = helper(0, 0, grid);

        int ans = Integer.MAX_VALUE;

        for (int xor : result) {
            ans = Math.min(ans, xor);
        }

        return ans;
    }

    public Set<Integer> helper(int i, int j, int[][] grid) {

        // Boundary check
        if (i >= n || j >= m) {
            return new HashSet<>();
        }

        // Already calculated
        if (dp[i][j] != null) {
            return dp[i][j];
        }

        Set<Integer> set = new HashSet<>();

        // Destination
        if (i == n - 1 && j == m - 1) {
            set.add(grid[i][j]);
            dp[i][j] = set;
            return set;
        }

        // Down
        Set<Integer> down = helper(i + 1, j, grid);

        for (int xor : down) {
            set.add(grid[i][j] ^ xor);
        }

        // Right
        Set<Integer> right = helper(i, j + 1, grid);

        for (int xor : right) {
            set.add(grid[i][j] ^ xor);
        }

        dp[i][j] = set;
        return set;
    }
}
