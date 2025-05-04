import java.util.*;

public class PrimsAlg{

static final int INF= Integer.MAX_VALUE; //Infinity, used for non-existing edges

// Function to find the minimum spanning tree using Prim's Algorithm
public static void primMST(int[][] graph,int V) {

// Array to store the constructed MST
int[] parent =new int[V];

// Key values used to pick the minimum weight edge in cut
int[] key = new int[V];

// To represent the set of vertices not yet included in MST
boolean[] mstSet= new boolean[V];

// Initialize all the keys as Infinite
Arrays.fill(key,INF);

// Start from the first vertex
key[0] = 0; //The key value of the starting vertex is always 0
parent[0] = -1;
// No parent for the first vertex

// The MST will have V vertices
for (int count =0; count < V - 1;count++) {
// Pick the minimum key vertex from the set of vertices not yet included in MST
int u =minKey(key, mstSet, V);

// Add the picked vertex to the MSTset
mstSet[u] =true;

// Update the key and parent values of the adjacent vertices
for (int v =0; v < V; v++) {
// Update the key only if graph[u][v] is smaller than the current key[v] and v is not yet in MST

if(graph[u][v]!= 0 && !mstSet[v] && graph[u][v]<key[v]) {

parent[v] = u;

key[v] = graph[u][v];
}
}
}

// Print the constructed MST
printMST(parent,graph, V);
}

// A utility function to find the vertex with the minimum key value
public static int minKey(int[] key,boolean[] mstSet, int V)
{
int min = INF,
minIndex = -1;

for (int v = 0; v< V; v++) {

if(!mstSet[v] && key[v] <min) {
min =key[v];
minIndex= v;
}
}
return minIndex;
}

// A utility function to print the constructed MST stored in parent[]

public static void printMST(int[] parent,int[][] graph, int V) {

System.out.println("Edge \tWeight");
for (int i = 1; i<V; i++) {

System.out.println(parent[i] + " - " + i + " \t" + graph[i][parent[i]]);
}
}

public static void main(String[] args) {
// Example graph represented by an adjacency matrix
int[][] graph =new int[][]{
{0, 2, 0,6, 0},
{2, 0, 3,8, 5},
{0, 3, 0,0, 7},
{6, 8, 0,0, 9},
{0, 5, 7,9, 0}
};

int V =graph.length;

// Call the function to find the Minimum Spanning Tree
primMST(graph,V);
}
}
