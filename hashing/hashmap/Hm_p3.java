package hashing.hashmap;
import java.util.*;
public class Hm_p3 {
    public static void main(String[]args){
         //country(key),population (value)
        HashMap<String, Integer> map=new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

     
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
