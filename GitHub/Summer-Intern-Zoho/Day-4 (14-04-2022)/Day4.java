import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Day4 {

    public static void main(String[] args){
        PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
        LinkedBlockingQueue<Integer> lBQ = new LinkedBlockingQueue<Integer>();
        PriorityBlockingQueue<Integer> pBQ = new PriorityBlockingQueue<Integer>();

        pQ.add(10);
        pQ.add(20);
        pQ.add(30);
        pQ.add(40);
        pQ.add(50);
        System.out.println(pQ);
        System.out.println(pQ.poll());
        System.out.println(pQ);
        Properties p = new Properties();
        p.put(1,"1");
        System.out.println(p);

        ArrayList l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add("Shyam");
        l.add(2.0);
        System.out.println(l);

        LinkedList l1 = new LinkedList();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(10);
        lhs.add(10);
        System.out.println(lhs);

        TreeSet ts = new TreeSet();
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(5);
        ts.add(50);

        System.out.println(ts.headSet(30));
        System.out.println(ts.tailSet(30));

        TreeMap tm = new TreeMap();
        tm.put(1, 'a');
        tm.put(2, 'b');
        tm.put(3, 'c');
        System.out.println(tm);

        System.out.println(tm.firstEntry());
        System.out.println(tm.tailMap(1));

    }

}
