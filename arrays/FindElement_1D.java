package arrays;
import java.util.*;
public class FindElement_1D {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array.");
        int size=sc.nextInt();
        int [] marks=new int [size];

        System.out.println("PLease enter the values for the array.");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        //output
        System.out.println("Enter a number you want to find in the array.");
        int x=sc.nextInt();

        boolean found=false; 
        for(int j=0; j<marks.length; j++){
            if (x==marks[j]){
                System.out.println(x+" found at position "+j+" in the array.");
                found=true;
                break;
            } }
           if(!found){
            System.out.println("Not found!");
           }
        sc.close();
    }
}
        

