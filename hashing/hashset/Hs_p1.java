package hashing.hashset;
import java.util.HashSet;
import java.util.Iterator;

public class Hs_p1 {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();
        //ArrayList<Integer> list= new ArrayList<>()

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(5); //list.add(el)

        //Search- contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain 6");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1");
        }

        //size
        System.out.println("The size of set is: "+ set.size());

        //all elements
        System.out.println(set);

        //Iterator 
        Iterator it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    
}
