package Graph.DFS;

import java.util.*;

public class FindIfPathExists {

    public static boolean validPath(int n, int[][] edges, int src, int dest){

        if(src == dest){
            return true;
        }

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
                graph.putIfAbsent(u, new ArrayList<>());
                graph.putIfAbsent(v, new ArrayList<>());
                graph.get(u).add(v);
                graph.get(v).add(u);

        }

        Set<Integer> visited = new HashSet<>();

        return dfs(src, dest, graph, visited);

    }

    public static boolean dfs(int currentNode, int dest, Map<Integer, List<Integer>> graph, Set<Integer> visited){
        if(currentNode == dest){
            return true;
        }
        visited.add(currentNode);

        if(graph.containsKey(currentNode)){
            for(int neighbor: graph.get(currentNode)){
                if(!visited.contains(neighbor)){
                    if(dfs(neighbor, dest, graph, visited)){

                        return true;

                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;

//        int[][] edges = {
//                {0,1},
//                {0,2},
//                {3,5},
//                {5,4},
//                {4,3}
//        };

        int[][] edges = {
                {0,1},
                {1,2},
                {2,3},
                {3,0}
        };

        System.out.println(validPath(n, edges, 0, n - 1));



    }
}
