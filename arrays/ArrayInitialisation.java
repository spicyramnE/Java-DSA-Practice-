package arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class ArrayInitialisation {
    public static void main(String[]args){
        // int stream . range (start, end+1)
        int [] arr1=IntStream.range(1,5).toArray();
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n");
        //int stream. range closed ( start, end)
        int []arr2=IntStream.rangeClosed(1,4).toArray();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }  
        System.out.println("\n");
        // int stream of (list)
        int [] arr3=IntStream.of(1,2,3,4).toArray();
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
      }
    
}
