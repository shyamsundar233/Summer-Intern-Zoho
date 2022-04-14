package mapFramework;

import java.util.*;

public class linkedHashMap {

    /*
    * It has key-value pair
    * Only unique keys
    * One null key and many null values
    * non-synchronized
    * It maintains insertion order
    * It has doubly linked list
    * */

    public static void main(String[] args){

        LinkedHashMap<Integer, String> lHashMap = new LinkedHashMap<Integer, String>();
        lHashMap.put(1, "Monday");
        lHashMap.put(2, "Tuesday");
        lHashMap.put(3, "Wednesday");
        lHashMap.put(4, "Thursday");
        lHashMap.put(5, "Friday");
        lHashMap.put(6, "Saturday");
        lHashMap.put(7, "Sunday");
        System.out.println(lHashMap);
        System.out.println(lHashMap.get(3));
        System.out.println(lHashMap.isEmpty());

        //initial capacity = 20
        LinkedHashMap<Integer, String> lHashMap1 = new LinkedHashMap<Integer, String>(20);

        //initial capacity = 20, loadFactor = 0.75
        LinkedHashMap<Integer, String> lHashMap2 = new LinkedHashMap<Integer, String>(20, 0.75f);

        //initial capacity = 20, loadFactor = 0.75, follow insertion order = false
        LinkedHashMap<Integer, String> lHashMap3 = new LinkedHashMap<Integer, String>(20, 0.75f, false);

    }

}
