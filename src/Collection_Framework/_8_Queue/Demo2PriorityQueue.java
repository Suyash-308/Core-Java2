package Collection_Framework._8_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo2PriorityQueue {
    public static void main(String[] args){

        // Data must be same type and getting Ascending order.

        Queue<Integer>queue=new PriorityQueue<>();
        queue.add(18);
        queue.add(32);
        queue.add(89);
        queue.add(3);
        queue.add(65);
        queue.add(31);

        System.out.println(queue.remove());

        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println(queue.poll());

        System.out.println(queue.remove());






    }
}
