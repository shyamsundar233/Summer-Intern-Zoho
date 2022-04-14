package collectionFramework.queue;

import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class linkedBlockingQueue {

    public static void main(String[] args){

        LinkedBlockingQueue<Integer> queue1 = new LinkedBlockingQueue<Integer>();
        for(int i=1;i<=5;i++){
            queue1.add(i*10);
        }
        System.out.println(queue1);

        //initial capacity = 20
        LinkedBlockingQueue<Integer> queue2 = new LinkedBlockingQueue<Integer>(20);

        Stack<Integer> stack = new Stack<Integer>();
        for(int i=1;i<=5;i++){
            stack.add(i*10);
        }
        LinkedBlockingQueue<Integer> queue3 = new LinkedBlockingQueue<Integer>(stack);
        System.out.println(queue3);

    }

}
