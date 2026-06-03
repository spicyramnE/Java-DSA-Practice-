package functions;
import java.util.*;

public class Functions {
    public static void printmyName(String name){
        System.out.println("My name is "+name+".");
        
    }
    public static int printSum(int a, int b){
        
        return a+b;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.next();
        System.out.println("Enter Number 1");
        int a=sc.nextInt();
        System.out.println("Enter Number 2");
        int b=sc.nextInt();
        
        
        printmyName(name);
        
        System.out.println("Sum of "+a+" and "+b+" is "+printSum(a, b)+".");

        sc.close();
    }
}
