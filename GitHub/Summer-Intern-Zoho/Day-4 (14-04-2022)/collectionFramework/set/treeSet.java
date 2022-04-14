package collectionFramework.set;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class treeSet {

    /*
     * Implements Balanced tree
     * Duplicates are not allowed
     * Insertion order is not maintained
     * Different objects cannot be stored
     * null insertion is allowed only once
     * Elements will be in natural ordering
     * */

    public static void main(String[] args){

        TreeSet<Integer> tree1 = new TreeSet<Integer>();
        for(int i=1;i<=5;i++){
            tree1.add(i*10);
        }
        System.out.println(tree1);
        System.out.println(tree1.size());
        System.out.println(tree1.headSet(30, true));
        System.out.println(tree1.headSet(30, false));
        System.out.println(tree1.tailSet(20, true));
        System.out.println(tree1.tailSet(20, false));

        LinkedList<Integer> lList2 = new LinkedList<Integer>();
        for(int i=1;i<=5;i++){
            lList2.add(i+9);
        }
        System.out.println(lList2);

        TreeSet<Integer> tree2 = new TreeSet<Integer>(lList2);
        System.out.println(tree2);

    }

}
