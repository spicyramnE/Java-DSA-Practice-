package functions.practiceQ;
import java.util.*;
public class Q7 {
    public static void Check(int n){
    
        if (n>0){
            System.out.println("The number is positive.");
        }
        else if(n==0){
            System.out.println("The number is neither negative nor positive.");
        }
        else{
            System.out.println("The number is negative");
        }
    }
    public static void main (String[]args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Check(n);
        sc.close();
    }
}
