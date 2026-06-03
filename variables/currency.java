package variables;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
public class currency {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double payment=sc.nextDouble();
        sc.close();
        NumberFormat indiaFormat= NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        DecimalFormat indiaDf= (DecimalFormat) indiaFormat;
        indiaDf.setPositivePrefix("Rs. ");
        indiaDf.setNegativePrefix("-Rs. ");
        
        
        System.out.println("US: "+NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("China: "+NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        // System.out.println("India: "+NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment));
        System.out.println("India: "+indiaFormat.format(payment));

    }
}
