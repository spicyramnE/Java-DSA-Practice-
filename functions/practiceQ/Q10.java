package functions.practiceQ;
import java.util.*;

public class Q10 {
    public static void fibonacci(int n) {
        int t1 = 0, t2 = 1;
        
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        for(int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();
        
        fibonacci(n);
        
        sc.close();
        
    }
}