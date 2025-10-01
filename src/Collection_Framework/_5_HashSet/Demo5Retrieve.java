package Collection_Framework._5_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class Demo5Retrieve {
    public static void main(String[] args){
    HashSet <Integer>hashSet=new HashSet<>();
    hashSet.add(50);
    hashSet.add(51);
    hashSet.add(52);
    hashSet.add(53);
    hashSet.add(54);
    hashSet.add(55);
    hashSet.add(56);
    hashSet.add(507);
    hashSet.add(58);

    System.out.println("Using enhanced for loop");
    for (int temp:hashSet){
        System.out.println(temp);
    }

    System.out.println("Using java8 feature lambda");
        Consumer consumer=x->System.out.println(x);
        hashSet.forEach(consumer);

        System.out.println("Using java8 method Ref");
        Consumer<Integer> consumer1=System.out::println;
        hashSet.forEach(consumer1);

        System.out.println("Using iterator cursor");

        Iterator<Integer> iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
