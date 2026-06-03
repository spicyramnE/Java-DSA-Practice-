package Conditionals;
import java.util.*;

public class Conditional {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        /** if (age>18) {
          System.out.println("Adult");}
        else {
          System.out.println("Not Adult");} 
        
        if (num%2==0){
            System.out.println("Even");
        
        }
        else{
            System.out.println("Odd");
        }

        if (a==b)
        {
            System.out.println("Equal");
        }
        else{
            if (a>b){
                System.out.println("a is Greater");
            }
            else{

                System.out.println("a is Lesserr");
            }
        } **/
        if (a==b)
        {
            System.out.println("Equal");
        } 
        else if(a>b){
            System.out.println("a is Greater");
        }
        else{

            System.out.println("a is Lesserr");
        }
        sc.close();

    }

    
}
