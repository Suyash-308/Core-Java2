package Collection_Framework._7_TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Demo4Retrieval {
    public static void main(String[] args){
        Set<Integer> set=new TreeSet();
        set.add(36);
        set.add(101);
        set.add(56);
        set.add(45678);
        set.add(8);

        for (int temp:set){
            System.out.println(temp);
        }

        Consumer consumer=X->System.out.println(X);
        set.forEach(consumer);

        Consumer consumer1=System.out::println;
        set.forEach(consumer1);

        Iterator<Integer> iterator= set.iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }

    }
}
