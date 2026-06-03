package arrays;
import java.util.*;
public class Array_Jagged {
    public static void main(String [] args){
        //Declaring 2d Array
        int [][] jagArray=new int[4][];
        //making jag array
        jagArray[0]=new int[3];
        jagArray[1]=new int[5];
        jagArray[2]=new int[1];
        jagArray[3]=new int[8];
        // initialising array
        int count = 0;
        for (int i = 0; i < jagArray.length; i++) {
            for (int j = 0; j < jagArray[i].length; j++){
                jagArray[i][j] = count++;

            }}
         	// Printing the Array Elements
        for (int i = 0; i < jagArray.length; i++) {
            for (int j = 0; j < jagArray[i].length; j++){
                System.out.print(jagArray[i][j] + " ");}
            System.out.println();}
                


    }
}
