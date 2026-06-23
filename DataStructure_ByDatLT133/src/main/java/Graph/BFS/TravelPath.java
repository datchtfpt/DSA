package Graph.BFS;

import java.util.*;

public class TravelPath {

    public static void travel(int n, Map<Integer, List<Integer>> graph, int src, int dest){

        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        visited.add(src);
        System.out.print(src + " ");
        queue.add(src);

        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int neighbor : graph.get(cur)){

                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    if(neighbor == dest){
                        return;
                    }
                    System.out.print(neighbor + " ");
                    queue.add(neighbor);
                }
            }
        }

    }



    public static void main(String[] args) {
        int n = 11;
        int[][] edges = {
                {1, 4},
                {1, 2},
                {2, 3},
                {2, 8},
                {2, 5},
                {2, 7},
                {3, 10},
                {3, 9},
                {5, 6},
                {8, 2},
                {8, 7},
                {7, 5},
        };

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        travel(n,graph,1, 6);
    }


}
