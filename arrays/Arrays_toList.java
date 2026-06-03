package arrays;
import java.util.*;
public interface Arrays_toList {
    public static void main(String []args){
        //asList() method- it converts an array to List
        /*  what is the difference between an array and a list in java?
            An array is fixed in nature, can only use primitve data types and cannot 
            be used to perform built in functions unlike list which is dynamic in nature ,
             has built in funcitons can be used to performs functions like add remove etc. */
      // Arrays and Lists are interchangeable

      int [] Arr={10,20,30,40};
      System.out.println("Integer Arrays as List: "+ Arrays.asList(Arr));
    // The out put may look a little weird which is : "[[I@251a69d7]" this is because it shows the memory reference of the list and not the values.
  
}

}
