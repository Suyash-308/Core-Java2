package Collection_Framework._8_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Demo1LinkedListQueue {
    public static void main(String[] args){
        Queue queue=new LinkedList();
        queue.add(10);
        queue.add(29);
        queue.add(43);
        queue.add(null);
        queue.add(null);
        queue.add("ram");
        queue.add("ram");
        queue.add(66);

        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());  // It gives null when queue is empty and try to poll
        System.out.println(queue.remove()); // It gives Exception when queue is empty and try to remove element












    }
}
