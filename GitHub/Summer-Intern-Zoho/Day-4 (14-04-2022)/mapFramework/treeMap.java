package mapFramework;

import java.util.TreeMap;

public class treeMap {

    /*
    * It is sorted according to natural sorting order of its keys
    * non-synchronized
    * Does not permit null keys
    * Null values are allowed
    * Duplicates not allowed
    * Maintains ascending order
    *
    * */

    public static void main(String[] args){
        TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
        tMap.put(1, "Monday");
        tMap.put(2, "Tuesday");
        tMap.put(3, "Wednesday");
        tMap.put(4, "Thursday");
        tMap.put(5, "Friday");
        tMap.put(6, "Saturday");
        tMap.put(7, "Sunday");
        System.out.println(tMap);
        System.out.println(tMap.get(3));
        System.out.println(tMap.isEmpty());
    }

}
