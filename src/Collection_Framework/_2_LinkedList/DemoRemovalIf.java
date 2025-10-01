package Collection_Framework._2_LinkedList;

import java.util.LinkedList;
import java.util.function.Predicate;

public class DemoRemovalIf {
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList<>();

        linkedList.add(11);
        linkedList.add(20);
        linkedList.add(31);
        linkedList.add(40);
        linkedList.add(51);
        linkedList.add(60);

        System.out.println(linkedList);

        Predicate<Integer> oddRemoval=X->X%2==1;

        linkedList.removeIf(oddRemoval);
        System.out.println(linkedList);




    }
}
