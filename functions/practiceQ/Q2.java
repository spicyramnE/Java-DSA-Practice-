package functions.practiceQ;
import java.util.*;
public class Q2 {

    public static int SumofOdd(int n){
        int s=0;
        for( int i=1;i<=n;i+=2){
            s=s+i;            
        }
        return s;
    }
    public static void main(String[]args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println("Sum of all odd numbers is "+SumofOdd(a));


        sc.close();

    }
    
}
