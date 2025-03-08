import java.util.Scanner; 
public class FactorialUsingRecursion{ 
    // Recursive method  to calculate factorial 
     public static long  factorial(int n) { 
    if (n <= 1) {
      return 1;  
    } 
    return n *  factorial(n - 1); 
    }
    public static void  main(String[] args) {
  Scanner scanner = new Scanner(System.in);   
     
   System.out.print("Enter a non-negative integer to  calculate its factorial:  "); 
    int number =  scanner.nextInt(); 
    if (number < 0) {  
   System.out.println("Facto rial is not defined for  negative numbers.");  
} else { 
    // Measure  start time 
    long  startTime =  System.nanoTime(); 
    // Call the  recursive method 
    long result = factorial(number);
    // Measure  end time 
    long endTime  = System.nanoTime(); 
    // Calculate  elapsed time 
    long  elapsedTime = endTime -  startTime; 
     
   System.out.println("Facto rial of " + number + "  is: " + result);
     
   System.out.println("Time  taken: " + elapsedTime +  " nanoseconds."); 
    } 
    scanner.close();  } 
   }
   