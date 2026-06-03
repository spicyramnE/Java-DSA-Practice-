package functions.practiceQ;
import java.util.*;
public class Q8 {
    public static double expo(int x, int n){
        return Math.pow(x,n);
    }
    public static void main(String[]args){

        System.out.println("Enter base value.");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter power value.");
        int b=sc.nextInt();
        sc.close();

        System.out.println(expo(a,b));
        sc.close();
    }
}
