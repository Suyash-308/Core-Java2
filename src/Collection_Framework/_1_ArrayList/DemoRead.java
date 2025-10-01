package Collection_Framework._1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class DemoRead {
    public static void main(String[] args){
    ArrayList<Integer> list=new ArrayList<>();

    list.add(11);
    list.add(12);
    list.add(13);
    list.add(14);
    list.add(15);


        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());


        for (int index = 0; index < list.size() ; index++) {
            System.out.println(list.get(index));
        }


        for (int temp : list) {
            System.out.print(temp +"\t");
        }
        System.out.print("\n");

        Consumer<Integer> consumer= X-> System.out.println(X);
        list.forEach(consumer);


        Consumer <Integer> consumer1=System.out::println;
        list.forEach(consumer1);


        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        ListIterator <Integer> iterator1= list.listIterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());

        }







    }
}
