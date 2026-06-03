import java.util.*;

public class HashMapCode {
    static class HashMap<K,V>{ //generic
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }

            private int n; // no. of nodes
            private int N; // Size of array
            private LinkedList<Node> buckets[]; //N=buckets.length
        
            @SuppressWarnings("unchecked")
            public HashMap(){
                this.N=4;
                this.buckets = new LinkedList[4];
                for(int i=0;i<4;i++){
                    this.buckets[i] = new LinkedList<>();
                }
            }

        }
    }    
}
