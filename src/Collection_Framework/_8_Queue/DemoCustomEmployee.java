package Collection_Framework._8_Queue;

import java.util.*;

public class DemoCustomEmployee {
    public static void main(String[] args){
        Queue<Employee> queue=new LinkedList<>();

        Employee employee1=new Employee(1, "Subhash", 50000);
        Employee employee2=new Employee(90, "Manoj", 30000);
        Employee employee3=new Employee(56, "Alice", 30000);
        Employee employee4=new Employee(244, "Shyam", 30000);
        Employee employee5=new Employee(2, "Ram", 30000);
        Employee employee6=new Employee(21, "Karan", 30000);
        Employee employee7=new Employee(23, "Hanuman",30000);


        queue.add(employee1);
        queue.add(employee2);
        queue.add(employee3);
        queue.add(employee4);
        queue.add(employee5);
        queue.add(employee6);
        queue.add(employee7);

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




    }
}
