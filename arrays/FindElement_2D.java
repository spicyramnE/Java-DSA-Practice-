package arrays;

import java.util.*;

public class FindElement_2D {
    
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
        for (int i=0;i<rows;i++){
            //inner loop -column
            for(intj=0; j<cols;j++){
                System.out.println("enter value for matrix position ("+i+")";
            }
        }

        for( int i=0; i<rows; i++){
            //inner loop column
            for(int j=0;j<cols;j++){
                System.out.println("enter value for matrix position("+i+","+j+")";
                }
        }
        for(int i=0;i<rows;i++){
            //inner loop-column 
            for(int j=0;j<cols;j++){
                System.out.println(numbers[i][j]+" ");

            }System.out.println();
        }
        System.out.println("Ennter value you want to find in aray.");
        int x=sc.nextInt();
        //ouptput
        //outer loop-row
        for(int i=0; i<rows;i++){
            //inner loop-column
            for(int j=0;j<cols;j++){
                System.out.println("Enter value for matrix position ("+i+","+j+")");
            }
        }
        for(int i=0;i<rows;i++){
            //inner loop-column
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+ " ");  
            }
            System.out.println();
        }

        //find element
        System.out.println("Enter value you want to find in array.");
        int x=sc.nextInt();
        boolean found=false;
        for(int i=0;i<rows;i++){
          
            for(int j=0;j<cols;j++){
                if (x==numbers[i][j]){
                    System.out.println(x+" found out at position ("+i+","+j+").");
                    found=true;
                    break;
                }
                
            }
        }
        if(!found){
            System.out.println("Not found!");
        }
     sc.close();
    }
}
