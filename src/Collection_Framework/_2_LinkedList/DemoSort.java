package Collection_Framework._2_LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class DemoSort {
    public static void main(String[] args){
        LinkedList list=new LinkedList<>();
        list.add(45);
        list.add(89);
        list.add(2);
        list.add(40);
        list.add(32);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
