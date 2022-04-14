package collectionFramework.List;

import java.util.*;

public class arrayList {

    /*
    * Implements resizable array
    * Duplicates are allowed
    * Insertion order is maintained
    * Different objects can be stored in a single list
    * null insertion is allowed
    * Best choice for random access
    * Bad choice for insertion and deletion
    * Non-Synchronized
    * Multithread can access at the same time - not thread safe
    * Performance is high
    * */

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            list.add(i*10);
        }
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.indexOf(40));
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            list1.add(i*100);
        }
        System.out.println(list1);
        System.out.println(list.addAll(2, list1));
        System.out.println(list);

        ArrayList list2 = new ArrayList();
        for(int i=1;i<=5;i++){
            list2.add(i+10);
        }
        for(int i=1;i<=5;i++){
            list2.add(((char)(i + 96)));
        }
        System.out.println(list2);

        //Creates an array with initial size of 10 -> Saves memory
        // Extends with (currentSize * 3/2)+1
        ArrayList list3 = new ArrayList(10);
        for(int i=1;i<=15;i++){
            list3.add(i*5);
        }
        System.out.println(list3);

        //Converts any collection to array list
        LinkedList<Integer> list4 = new LinkedList<Integer>();
        for(int i=1;i<=5;i++){
            list4.add(i*2);
        }
        System.out.println(list4);
        ArrayList<Integer> list5 = new ArrayList<Integer>(list4);
        System.out.println(list5);

    }

}
