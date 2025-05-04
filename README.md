#DAA 4th Sem

-This repository contains programs related to Design and Analysis of Algorithms (DAA) for the 4th semester.

#Programs Included

1. Factorial using Iterative Method
   
-This program calculates the factorial of a given number using an iterative approach (loop-based method).

3. Factorial using Recursion

-This program calculates the factorial of a given number using recursion, where the function calls itself to compute the result.

Input: 5

Output: Factorial of 5 is 120


3.Binary Search

-This is an implementation of the Binary Search Algorithm in java. Binary Search is an efficient searching technique used to find an element in a sorted array in O(log n) time complexity.

4.Linear Search 

-Linear Search is a simple searching algorithm that sequentially checks each element in an array until the target value is found or the end of the array is reached. It has a time complexity of O(n), making it efficient for small datasets but not ideal for large ones.

#How It Works

1.Start from the first element of the array.

2.Compare each element with the target value.

3.If a match is found, return the index of the element.

4.If the loop completes without finding the target, return -1 to indicate the element is not present.

5.Merge Sort

-This is a simple Java implementation of the Merge Sort algorithm — a classic divide-and-conquer sorting algorithm.

#Features

-Sorts an array of integers

-Uses recursion to divide the array

-Merges sorted halves efficiently

#Sample Output

Original array:
[38, 27, 43, 3, 9, 82, 10]

Sorted array:
[3, 9, 10, 27, 38, 43, 82]

6.Quick sort

-This program implements the Quick Sort algorithm using an array. Quick Sort is a popular and efficient sorting technique that follows the divide and conquer strategy.

#Key Features

-Fast average-case time complexity: O(n log n).

-In-place sorting (no extra array needed).

-Efficient for large datasets.

#How Quick Sort Works

1.Choose a pivot element (commonly the last element or a random element).

2.Partition the array so that:

  -All elements less than the pivot come before it.

  -All elements greater come after it.

3.Recursively apply the same process to the left and right partitions.

7. Dijkstra's Algorithm 

-This program implements **Dijkstra's Algorithm** in Java to find the shortest path from a source node to all other nodes in a weighted graph with non-negative edge weights.

### Features:
- Uses a priority queue for efficient minimum distance selection.
- Supports custom graph input via adjacency matrix or list.
- Outputs the shortest distance from the source node to all other nodes.

## Sample Output
 Vertex  Distance from Source
0        0
1        4
2        12
3        19
4        21
5        11
6        9
7        8
8        14


8.Prim's Algorithm 

-This program implements **Prim's Algorithm** in Java to find the **Minimum Spanning Tree (MST)** of a connected, undirected, weighted graph.

### Features:
- Builds an MST by always choosing the edge with the smallest weight that connects a visited and unvisited node.
- Efficient for dense graphs using an adjacency matrix.
- Outputs the edges selected and the total weight of the MST.

#Sample Output

Edge   Weight
0 - 1     2
1 - 3     3
0 - 2     6
3 - 4     5

Total cost of Minimum Spanning Tree: 16


#How to Run

1.Clone the repository

git clone https://github.com/your-username/DAA-4th-Sem.git
cd DAA-4th-Sem

2.Compile and run the Java files

javac FactorialIterative.java  
java FactorialIterative  
javac FactorialRecursive.java  
java FactorialRecursive  

#Example Output

Input: 5

Output: Factorial of 5 is 120


#Contributing

-Feel free to fork this repository, raise issues, or contribute by adding more DAA programs!

#License

This project is open-source and free to use.

