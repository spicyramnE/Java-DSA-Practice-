package functions.practiceQ;
import java.util.*;
public class Q5 {
    public static void eligibility(int age){
        if (age<18){
            System.out.println("Candidate not elgibile to vote.");
        }
        else {
            System.out.println("Candidate is eligible to vote.");
        }
    }
    public static void main (String[]args){
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        eligibility(age);

        sc.close();
    }    
}

