import java.util.Scanner; 
public class factorial{ 
 public static long  factorialIterative(int n) { 
 long result = 1;  for (int i = 1; i <= n; i++) { 
 result *= i; 
 }
 return result; 
 } 
 public static void  main(String[] args) { 
     Scanner scanner = new Scanner(System.in); 
 // Input: Get a  number from the user   
System.out.print("Enter a positive integer to  calculate its factorial:  ");
 int n = scanner.nextInt(); 
 if (n < 0) {   
System.out.println("Facto rial is not defined for  negative numbers.");  
} else { 
 // Measure  start time 
 long startTime = System.nanoTime();
  long result = factorialIterative(n); 
 // Measure  end time 
 long endTime  = System.nanoTime(); 
 // Display  the results 
  
System.out.println("The  factorial of " + n + " is: " + result); 
  
System.out.println("Runni ng time of the program: " + (endTime - startTime) + " nanoseconds"); 
 } 
 scanner.close(); 
 } 
}
