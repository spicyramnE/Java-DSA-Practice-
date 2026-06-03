package arrays;
import java.util.*;
public class Array_BinS {
    public static void main(String[]args){
        int arr[]={10,56,78,34,56,90,20};
        Arrays.sort(arr);
        int key=90;
        System.out.println(key+" found at index = "+Arrays.binarySearch(arr,key));
    }
}
