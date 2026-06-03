package advancepattern;

public class Pattern1 {
    public static void main(String[] args) {
        int n=4;
        //outer loop upper half
        for(int i=1; i<=n;i++){
            //left stars
            for( int j=1; j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space=2*(n-i);
            for (int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //right stars
            for( int j=1; j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        //outer loop lower half
        for (int i=n; i>=1;i--){
            //left stars
            for( int j=1; j<=i;j++){
                System.out.print("*");
            }
            //for space
            int space=2*(n-i);
            for(int j =1;j<=space;j++){
                System.out.print(" ");
            }//right stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
