class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i = 0 ; i < n ; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i< edges.length ; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);
            graph[v].add(u);
        }
        return isPath(graph,source,destination,new boolean[n]);
    }

    public static boolean isPath(ArrayList<Integer>[] graph,int source,int destination,boolean[] vis){
        if(source == destination){
            return true;
        }
        vis[source] = true;
        for(int i = 0 ; i < graph[source].size(); i++){
            int next = graph[source].get(i);
            if(!vis[next]){
                if(isPath(graph,next,destination,vis)){
                    return true;
                }
            }
        }
        return false;
    }
}