import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphImplementation {

    static void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        System.out.print(node + " ");
        visited[node] = true;

        for (int i : graph.get(node)) {
            if (visited[i] == false) {
                dfs(i, graph, visited);
            }
        }

    }

    static void bfs(int node, List<List<Integer>> graph, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;

        while (!q.isEmpty()) {
            int element = q.poll();
            System.out.print(element + " ");

            for (int i : graph.get(element)) {
                if (!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }

        }
    }

    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<Integer>());
        }
        graph.get(1).add(2);
        graph.get(1).add(4);
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(3).add(2);
        graph.get(3).add(4);
        graph.get(4).add(1);
        graph.get(4).add(3);
        System.out.println(graph);

        boolean[] visited = new boolean[V + 1];
        // dfs(1, graph, visited);
        bfs(1, graph, visited);

    }

}
