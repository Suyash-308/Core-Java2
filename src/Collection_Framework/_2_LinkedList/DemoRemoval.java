package Collection_Framework._2_LinkedList;

import java.util.LinkedList;

public class DemoRemoval {
    public  static void main(String[] args){
        LinkedList linkedList=new LinkedList();
        linkedList.add(11);
        linkedList.add(21);
        linkedList.add(31);
        linkedList.add(41);
        linkedList.add(51);
        linkedList.add(61);

        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        LinkedList retainList=new LinkedList<>();
        retainList.add(51);

        linkedList.retainAll(retainList);
        System.out.println(linkedList);



    }
}
