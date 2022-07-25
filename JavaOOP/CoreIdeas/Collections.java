package JavaOOP.CoreIdeas;

import java.util.ArrayList;
import java.util.HashSet; //getting the hesh set
import java.util.Iterator;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {

        int[] a = {3, 5, 1}; // primitive array 
        System.out.println(a[1]);

        HashSet<String> hs = new HashSet<String>(); // no-order no-duplicates
        hs.add("Python");
        hs.add("Java");

        hs.add("JavaScript");
        hs.add("JavaScript");  // no-duplicates


        hs.remove("JavaScript");

        

        System.out.println(hs.contains("JavaScript")); // contains return true or false if the hs contains the string "JavaScript"  
        System.out.println(hs.isEmpty()); // contains return true if the hs is empty 
        System.out.println(hs.hashCode()); 


        // we can create an iterator to iterate over the HashSet
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        LinkedList<String> ll = new LinkedList<String>(); /*
        * 1. implemented Serializable, Cloneable, Iterable<E>, Collection<E>, Deque<E>, List<E>, Queue<E>
        * 2. Maintains insertion order
        * 3. Duplicates are allowed
        * 4. it is not synchronized
        * 5. iterator & ListIterator returns fail-fast iterator+ListIterator
        */
        
        ArrayList<String> al = new ArrayList<String>();
        /*
         * 1. implemented Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess
         * 2. maintains insertion order
         * 3. duplicates are allowed
         * 4. it is not synchronized
         */
         


    }
}
