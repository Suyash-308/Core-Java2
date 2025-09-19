package Collection_Framework.Vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.function.Consumer;

public class DemoRead {
    public static void main(String[] args){
        Vector<Integer> vector=new Vector<>();
        vector.add(30);
        vector.add(32);
        vector.add(33);
        vector.add(34);
        vector.add(35);
        vector.add(36);
        vector.add(37);
        vector.add(38);
        vector.add(39);

        System.out.println(vector.get(2));
        System.out.println(vector.getFirst());
        System.out.println(vector.getLast());


        System.out.println("Using for loop");
        for (int index = 0; index < vector.size(); index++) {
            System.out.println(vector.get(index));
        }



        System.out.println("Using enhanced for loop");
        for(int S:vector){
            System.out.println(S);
        }


        System.out.println("Using Java-8 feature (Lambda)");
        Consumer consumer=x->System.out.println(x);
        vector.forEach(consumer);


        System.out.println("Using Java-8 feature (MethodRef)");
        Consumer consumer1=System.out::println;
        vector.forEach(consumer1);



        System.out.println("Using Iterator ");
        Iterator iterator=vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("Using ListIterator ");
        ListIterator listIterator=vector.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }











    }
}
