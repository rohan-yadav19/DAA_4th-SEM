import java.util.*;

public class DijkstrasAlg {

static final int INF= Integer.MAX_VALUE;
static final int V =4; // Number of vertices

// Function to findthe vertex with the minimum distance value
int minDistance(int[] dist, boolean[] visited){
int min = INF,
minIndex = -1;
for (int v = 0; v< V; v++) {
if(!visited[v] && dist[v]<= min) {
min =dist[v];
minIndex= v;
}
}

return minIndex;
}

// Dijkstra's algorithm implementation
void dijkstra(int[][] graph, int src) {
int[] dist = new int[V]; // Output array. dist[i] isshortest distance from src to i
boolean[] visited= new boolean[V]; //visited[i] is true if vertex i is processed

// Initialize distances
Arrays.fill(dist,INF);

Arrays.fill(visited,false);
dist[src] = 0;

for (int count =0; count < V - 1;count++) {
int u =minDistance(dist,visited);
visited[u] =true;

for (int v =0; v < V; v++) {
if(!visited[v] &&graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v]<dist[v]) {

dist[v] = dist[u] +graph[u][v];
}
}
}

// Print shortest distances

System.out.println("Vertex \t Distance from Source" + src);
for (int i = 0; i<V; i++)

System.out.println(i + "\t\t " + dist[i]);
}

public static void main(String[] args) {
// Graph with 4 vertices (0 to 3)
// 0 -> 1 (weight 5), 0 -> 2 (weight 10), 1-> 3 (weight 2), 2 -> 3 (weight 1)
int[][] graph = {
{0, 5, 10,0},
{5, 0, 0, 2},
{10, 0, 0,1},
{0, 2, 1, 0}
};

DijkstrasAlg obj = new DijkstrasAlg();

obj.dijkstra(graph, 0);
// Start from vertex 0
}
}
