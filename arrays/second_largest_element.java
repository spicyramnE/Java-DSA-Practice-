package arrays;
import java.util.*;
import java.util.stream.IntStream;
public class second_largest_element{
    public static void main(String[]args){
        int[] arr=IntStream.of(2,1,4,7,5,7).toArray();
        int n=arr.length;
        /*brute force approach
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largest){
                System.out.println("Second Largest Element is "+arr[i]);
                break;
            }
        }*/

        /*better approach
        Arrays.sort(arr);
        int largest=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int second_largest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>second_largest && arr[i]!=largest){
                second_largest=arr[i];
            }
        }
        System.out.println(second_largest);*/

        //Optimal Solution
        int largest=arr[0];
        int slargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
                
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
                
            }
        } System.out.println(slargest);
    }
}
