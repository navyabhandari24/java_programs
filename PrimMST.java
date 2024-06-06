import java.util.*;

class PrimMST {
    private static final int V = 5; // Number of vertices in the graph

    // Function to find the vertex with the minimum key value, from the set of vertices not yet included in MST
    private int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    // Function to print the constructed MST stored in parent[]
    private void printMST(int[] parent, int[][] graph) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    // Function to construct and print MST for a graph represented using adjacency matrix representation
    void primMST(int[][] graph) {
        int[] parent = new int[V]; // Array to store constructed MST
        int[] key = new int[V]; // Key values used to pick the minimum weight edge in cut
        boolean[] mstSet = new boolean[V]; // To represent set of vertices included in MST

        // Initialize all keys as INFINITE
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0; // Make the key 0 so that this vertex is picked as the first vertex
        parent[0] = -1; // First node is always the root of MST

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph);
    }

    public static void main(String[] args) {
        PrimMST mst = new PrimMST();
        int[][] graph = new int[][] {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        mst.primMST(graph);
    }
}

