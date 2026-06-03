package arrays;
import java.util.*;
public class Array_removeduplicate {
    public static void main(String[] args){
    //brute force
    int [] arr1={1,1,2,3,3,3,4,5,6,6,6,6,7,8,8,9};
    int[] arr2=new int[arr1.length];
    for(int i=0;i<arr1.length;i++){
        for(int j=1;j<arr1.length;j++){
            if(arr1[i]==arr2[j]){
                arr2[i]=arr1[j];
            }
        System.out.print(arr2[i]);}
            
        }
    }
    }
