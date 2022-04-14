package collectionFramework.queue;

import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;

public class priorityBlockingQueue {

    public static void main(String[] args){

        PriorityBlockingQueue<Integer> queue1 = new PriorityBlockingQueue<Integer>();
        for(int i=1;i<=5;i++){
            queue1.add(i*10);
        }
        System.out.println(queue1);

        //initital capacity = 20
        PriorityBlockingQueue<Integer> queue2 = new PriorityBlockingQueue<Integer>(20);

        Stack<Integer> stack = new Stack<Integer>();
        for(int i=1;i<=5;i++){
            stack.add(i*10);
        }
        PriorityBlockingQueue<Integer> queue3 = new PriorityBlockingQueue<Integer>(stack);
        System.out.println(queue3);

    }

}
