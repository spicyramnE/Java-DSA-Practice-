//largest element in an array
//brute-better-optimal
package arrays;
import java.util.stream.IntStream;
import java.util.*;
public class largest_element {
    public static void main(String[] args) {
        int [] arr=IntStream.of(1,6,9,10,23,5,4).toArray();
    //brute force approach
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    // optimal solution
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            System.out.println(largest);
        }
    
    }
           
}
