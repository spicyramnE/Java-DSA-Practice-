package functions.practiceQ;
import java.util.*;
public class Q9 {
    public static int GrtComDiv(int a, int b){
        if (b==0){
            return a;
        }
        return GrtComDiv(b, a%b);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();

        System.out.println(GrtComDiv(a, b));
        sc.close();
    }
    
}
