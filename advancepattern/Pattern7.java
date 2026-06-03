package advancepattern;

public class Pattern7 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            //spaces
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //ascending alphabets
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);}
            //descending alphabets
            for(char ch = (char)('A'+i-2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
           
           System.out.println();
        }
    }
    
}
