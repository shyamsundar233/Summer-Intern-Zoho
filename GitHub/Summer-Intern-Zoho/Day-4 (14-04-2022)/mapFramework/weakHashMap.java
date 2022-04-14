package mapFramework;

import java.util.*;

public class weakHashMap {

    /*
    * If the key doesn't contain any value it is sent to garbage collection
    * */

    public static void main(String[] args){

        WeakHashMap<Integer, String> wHashMap = new WeakHashMap<Integer, String>();
        wHashMap.put(1, "Monday");
        wHashMap.put(2, "Tuesday");
        wHashMap.put(3, "Wednesday");
        wHashMap.put(4, "Thursday");
        wHashMap.put(5, "Friday");
        wHashMap.put(6, "Saturday");
        wHashMap.put(7, "Sunday");

        System.out.println(wHashMap);

        WeakHashMap wHashMap1 = new WeakHashMap();

        treeMap obj = new treeMap();

        wHashMap1.put(obj, 2);
        obj=null;

        System.out.println(wHashMap1);

    }

}
