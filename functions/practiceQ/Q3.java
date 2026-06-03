package functions.practiceQ;
import java.util.*;
public class Q3 {
    public static int MaxNum(int a, int b){
        int max;
        if (a>b){
            max=a;
        }
        else{
            max=b;
        }
        return max;
    }
    public static void main(String []args){
        System.out.println("Enter 2 numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println("The greatest number of the two is "+MaxNum(a,b));

        sc.close();

    }
    
}
