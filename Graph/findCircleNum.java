package Graph;

public class findCircleNum {
    //给出邻接矩阵，求连通分量数量
    //dfs 的写法
    public int connectedComponent(int[][] isConnected) {
        int cityNum = isConnected.length;
        boolean[] isVisited = new boolean[cityNum];
        int res = 0;
        for (int i = 0; i < cityNum; i++) {
            if (!isVisited[i]) {
                dfs(isConnected, isVisited, cityNum, i);
                res++;
            }
        }
        return res;
    }

    protected void dfs(int[][] isConnected, boolean[] isVisited, int cityNUm, int i) {
        for (int j = 0; j < cityNUm; j++) {
            if (isConnected[i][j] == 1 && !isVisited[j]) {
                isVisited[j] = true;
                dfs(isConnected, isVisited, cityNUm, j);
            }
        }
    }
}
