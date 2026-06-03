package functions.practiceQ;
import java.util.*;

public class Q1 {
    public static double printAvg(int a, int b, int c) {
        return (a + b + c) / 3.0;  // Changed to double division
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter a number:");
        int b = sc.nextInt();
        System.out.println("Enter a number:");
        int c = sc.nextInt();

        System.out.println("Average is: " + printAvg(a, b, c));
        
        sc.close();
    }
}
