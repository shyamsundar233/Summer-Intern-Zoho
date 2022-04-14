package collectionFramework.List;

import java.util.*;

public class stackVector {
    /*
    * Follows LastIn and FirstOut
    * Child of vector class
    * It has the same as vector class
    * */
    public static void main(String[] args){

        Stack<Integer> stack = new Stack<Integer>();
        for(int i=1;i<=5;i++){
            stack.add(i*10);
        }

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.size());

    }

}
