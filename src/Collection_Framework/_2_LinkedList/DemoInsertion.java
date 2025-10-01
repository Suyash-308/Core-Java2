package Collection_Framework._2_LinkedList;

import java.util.LinkedList;

public class DemoInsertion {
    public static void main(String[] args){

        LinkedList linkedList=new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);

        System.out.println(linkedList);

        linkedList.add(0,90);
        System.out.println(linkedList);

        LinkedList list=new LinkedList<>();
        list.add(22);
        list.add(33);

        linkedList.addAll(list);
        System.out.println(linkedList);

        linkedList.addAll(1,list);
        System.out.println(linkedList);




    }
}
