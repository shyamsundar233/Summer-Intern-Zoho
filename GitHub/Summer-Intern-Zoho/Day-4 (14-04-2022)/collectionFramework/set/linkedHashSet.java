package collectionFramework.set;

import java.util.*;

public class linkedHashSet {

    /*
     * Implements Hash table
     * Duplicates are not allowed
     * Insertion order is not maintained
     * Different objects can be stored in a single list
     * null insertion is allowed
     * Best choice for searching
     * Bad choice for random access
     * */

    public static void main(String[] args){

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for(int i=1;i<=5;i++){
            set.add(i*10);
        }
        set.add(10); //returns false
        System.out.println(set);
        System.out.println(set.size());

        //constructors

        //initial capacity = 16 and fill ratio = 0.75
        HashSet<Integer> hash1 = new HashSet<Integer>();

        //initial capacity = 6 and fill ratio = 0.75
        HashSet<Integer> hash2 = new HashSet<Integer>(6);

        //initial capacity = 6 and fill ratio = 0.5
        HashSet<Integer> hash3 = new HashSet<Integer>(6, 0.5f);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        //Convert any collection to hashset
        HashSet<Integer> hash4 = new HashSet<Integer>(list);

    }

}
