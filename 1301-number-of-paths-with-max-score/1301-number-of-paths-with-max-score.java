class Solution {

    static final int MOD = 1_000_000_007;
    int n;

    int[][] score;
    int[][] ways;
    boolean[][] vis;

    public int[] pathsWithMaxScore(List<String> board) {

        n = board.size();

        score = new int[n][n];
        ways = new int[n][n];
        vis = new boolean[n][n];

        dfs(0, 0, board);

        if (ways[0][0] == 0)
            return new int[]{0, 0};

        return new int[]{score[0][0], ways[0][0]};
    }

    void dfs(int i, int j, List<String> board) {

        if (i >= n || j >= n)
            return;

        if (board.get(i).charAt(j) == 'X')
            return;

        if (vis[i][j])
            return;

        vis[i][j] = true;

        // Base Case (S)
        if (i == n - 1 && j == n - 1) {
            score[i][j] = 0;
            ways[i][j] = 1;
            return;
        }

        // down
        if (i + 1 < n)
            dfs(i + 1, j, board);

        // right
        if (j + 1 < n)
            dfs(i, j + 1, board);

        // diagonal
        if (i + 1 < n && j + 1 < n)
            dfs(i + 1, j + 1, board);

        int best = -1;
        int cnt = 0;

        int[][] dir = {{1,0},{0,1},{1,1}};

        for (int[] d : dir) {

            int x = i + d[0];
            int y = j + d[1];

            if (x >= n || y >= n)
                continue;

            if (ways[x][y] == 0)
                continue;

            if (score[x][y] > best) {
                best = score[x][y];
                cnt = ways[x][y];
            } else if (score[x][y] == best) {
                cnt = (cnt + ways[x][y]) % MOD;
            }
        }

        if (best == -1)
            return;

        char ch = board.get(i).charAt(j);

        if (ch != 'E')
            best += ch - '0';

        score[i][j] = best;
        ways[i][j] = cnt;
    }
}