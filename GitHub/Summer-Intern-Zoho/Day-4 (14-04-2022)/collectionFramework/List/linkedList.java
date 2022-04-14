package collectionFramework.List;

import java.util.*;

public class linkedList {

    /*
     * Implements doubly linked list
     * Duplicates are allowed
     * Insertion order is maintained
     * Different objects can be stored in a single list
     * null insertion is allowed
     * Best choice for insertion and deletion
     * Bad choice for random access
     * */

    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=1;i<=5;i++){
            list.add(i*10);
        }
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.indexOf(40));
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        for(int i=1;i<=5;i++){
            list1.add(i*100);
        }
        System.out.println(list1);
        System.out.println(list.addAll(2, list1));
        System.out.println(list);

        LinkedList list2 = new LinkedList();
        for(int i=1;i<=5;i++){
            list2.add(i+10);
        }
        for(int i=1;i<=5;i++){
            list2.add(((char)(i + 96)));
        }
        System.out.println(list2);

        //Converts any collection to linked list
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            list4.add(i*2);
        }
        System.out.println(list4);
        LinkedList<Integer> list5 = new LinkedList<Integer>(list4);
        System.out.println(list5);

    }

}
