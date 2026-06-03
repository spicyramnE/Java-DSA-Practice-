package functions.practiceQ;
import java.util.*;
public class Q4 {
    public static double Circle(double radius){
    
    return radius*2*3.14;
    }
    public static void main(String[]args){
        System.out.println("Enter the radius of the circle.");
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();

        System.out.println("The circumference of the circle is "+ Circle(radius));

        sc.close();
    }
    
}
