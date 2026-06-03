package arrays;
import java.util.*;
public class Array_2D {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows");
        int rows=sc.nextInt();
        System.out.println("Enter Columns");
        int cols=sc.nextInt();
        int[][] numbers =new int[rows][cols];
        //input
        //outer loop-row
        for(int i=0;i<rows;i++){
            //inner loop-column
            for(int j=0;j<cols;j++){
                System.out.println("Enter value for matrix position ("+i+","+j+")");
                numbers[i][j]=sc.nextInt();
            }
        }
       /*
       for(int i=0;i,rows;i++){
       for(int j=0;j<clos;j++){
       syso.out.print(numbers[i][j]+ " ");}
       system.out.println();}sc.close();}}
        */
}
        //ouptput
        //outer loop-row
        for(int i=0;i<rows;i++){
            //inner loop-column
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+ " ");  
            }
            System.out.println();
        }
        sc.close();
    }
}


for( int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
System.outprint(numbers[i][j]+" ");
}
system.outprintln();
}system.out.println();
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++)
        
}


