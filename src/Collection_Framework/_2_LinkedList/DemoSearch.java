package Collection_Framework._2_LinkedList;

import java.util.LinkedList;

public class DemoSearch {
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList<>();

        linkedList.add(23);
        linkedList.add(98);
        linkedList.add(3);
        linkedList.add(76);

        System.out.println(linkedList);

        System.out.println(linkedList.contains(23));

        System.out.println(linkedList.contains(20));


        LinkedList list=new LinkedList<>();
        list.add(76);
        list.add(23);

        System.out.println(linkedList.containsAll(list));





    }
}
