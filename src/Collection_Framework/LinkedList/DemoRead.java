package Collection_Framework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.Consumer;

public class DemoRead {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(89);
        list.add(99);
        list.add(108);
        list.add(17765);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(3));

// Traditional for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//Enhanced for loop
        for(int temp : list) {
            System.out.println(temp);
        }


       // using lambda
        Consumer consumer=X->System.out.println(X);
        list.forEach(consumer);

// Using method ref
        Consumer consumer1=System.out::println;
        list.forEach(consumer1);


        // Using iterator
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

       // Using list iterator

       ListIterator iterator1=list.listIterator() ;
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());

        }
    }
}
