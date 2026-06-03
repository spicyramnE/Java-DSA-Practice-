package arrays;
import java.util.*;
import java.util.stream.IntStream;
public class Array_CheckSort {
    //brute force
       public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // Not sorted
            }
        }
        return true; // Sorted
    }
     public static void main(String[] args) {
        int[] arr = {1, 7,6,3,4};
        if (isSorted(arr)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
    
    }




