package collectionFramework.List;

import java.util.*;

public class vectorList {

    /*
     * Duplicates are allowed
     * Insertion order is maintained
     * Different objects can be stored in a single list
     * null insertion is allowed
     * Best choice for random access
     * Bad choice for insertion and deletion
     * Synchronized
     * Multithreading not allowed - thread safe
     * */

    public static void main(String[] args){

        Vector<Integer> list = new Vector<Integer>();
        for(int i=1;i<=5;i++){
            list.add(i*10);
        }
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.indexOf(40));
        Vector<Integer> list1 = new Vector<Integer>();
        for(int i=1;i<=5;i++){
            list1.add(i*100);
        }
        System.out.println(list1);
        System.out.println(list.addAll(2, list1));
        System.out.println(list);

        Vector list2 = new Vector();
        for(int i=1;i<=5;i++){
            list2.add(i+10);
        }
        for(int i=1;i<=5;i++){
            list2.add(((char)(i + 96)));
        }
        System.out.println(list2);

        //Creates an array with initial size of 10 -> Saves memory
        // Extends with 2 * currentCapacity
        Vector list3 = new Vector(10);
        for(int i=1;i<=15;i++){
            list3.add(i*5);
        }
        System.out.println(list3);

        //Converts any collection to vector list
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            list4.add(i*2);
        }
        System.out.println(list4);
        Vector<Integer> list5 = new Vector<Integer>(list4);
        System.out.println(list5);

    }

}
