package collectionFramework.queue;

import java.util.*;

public class priorityQueue {

    /*
    * Elements are processed based on their priority
    * FIFO concept is followed
    * Natural ordering orders the elements
    * No null is allowed
    * It is not thread safe
    * It uses priority conditions
    * */

    public static void main(String[] args){

        PriorityQueue<Integer> queue1 = new PriorityQueue<Integer>();
        for(int i=1;i<=5;i++){
            queue1.add(i*10);
        }
        System.out.println(queue1);
        System.out.println(queue1.peek());
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);
        System.out.println(queue1.remove(10));
        System.out.println(queue1);
        System.out.println(queue1.size());

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            list.add(i);
        }
        System.out.println(list);
        PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>(list);
        System.out.println(queue2);

        //initial capacity = 10
        PriorityQueue<Integer> queue3 = new PriorityQueue<Integer>(10);

    }

}
