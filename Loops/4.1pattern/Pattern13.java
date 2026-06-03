package Loops.pattern;

public class Pattern13 {
    public static void main(String[] args) {
        //outer loop
        for(int i=4;i>=1;i--){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
