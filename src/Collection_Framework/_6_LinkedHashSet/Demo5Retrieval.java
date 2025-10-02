package Collection_Framework._6_LinkedHashSet;

import java.util.*;
import java.util.function.Consumer;

public class Demo5Retrieval {
    public static void main(String[] args){
        Set<Integer> set=new LinkedHashSet();
        set.add(20);
        set.add(30);
        set.add(101);

        System.out.println(set);

        for (int temp:set){
            System.out.println(temp);
        }

        Consumer consumer=X->System.out.println(X);
        set.forEach(consumer);



        Consumer consumer1=System.out::println;
        set.forEach(consumer1);

        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
