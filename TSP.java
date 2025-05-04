public class TSP {
    public static void main(String[] args) {
    int[][] cost = {
    {0, 10, 15},
    {10, 0, 20},
    {15, 20, 0}
    };
    
    int n = 3;
    int minCost =Integer.MAX_VALUE;
    String bestPath ="";
    
    // Try all possible permutations (3 cities = 3! = 6 paths)
    for (int i = 1; i< n; i++) {
    for (int j =1; j < n; j++) {
    if (i ==j) 
    continue;
    int k = 3 - i - j; // remaining city (since only 3 cities: 0, 1, 2)
    
    int currentCost = cost[0][i]+ cost[i][j] +cost[j][0];
    if(currentCost < minCost) {
    
    minCost = currentCost;
    
    bestPath =pathToString(0, i, j, 0);
    }
    }
    }
    
    System.out.println("Minimum tour cost: " +minCost);
    
    System.out.println("Optimal path: " + bestPath);
    }
    
    private static String pathToString(int...cities) {
    StringBuilder sb= new StringBuilder();
    for (int city :cities) {
    
    sb.append((char)('A' +city)).append(" ");
    }
    return sb.toString().trim();
    }
    }
