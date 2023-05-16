package com.ll.leverl3.p92343;

public class Main {

    public static void main(String[] args) {

    }


}
class Solution {
    static int[] myinfo;
    static int[][] myedges;
    static int maxSheep = Integer.MIN_VALUE;
    public int solution(int[] info, int[][] edges) {
        int answer = 0;

        myinfo = info;
        myedges = edges;

        boolean[] visited = new boolean[info.length];

        dfs(0, visited, 0, 0);

        answer = maxSheep;

        return answer;
    }

    public void dfs(int node, boolean[] visited, int sheep, int wolf) {

        visited[node] = true;

        if (myinfo[node] == 0) {
            sheep++;
            if (maxSheep < sheep) {
                maxSheep = sheep;
            }
        } else {
            wolf++;
        }

        if (wolf >= sheep) {
            return;
        }


        for (int[] edge : myedges) {

            if (visited[edge[0]] && !visited[edge[1]]) { //visited[edge[0]] 어렵네,,

                boolean[] newVisited = new boolean[myinfo.length];
//                newVisited = visited;
                for (int i = 0; i < visited.length; i++) {
                    newVisited[i] = visited[i];
                }

                dfs(edge[1], newVisited, sheep, wolf);

            }

        }

    }
}
