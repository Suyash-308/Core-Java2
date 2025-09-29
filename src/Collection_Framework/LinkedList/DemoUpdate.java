package Collection_Framework.LinkedList;

import java.util.LinkedList;

public class DemoUpdate {
    public static void main (String[] args){
        LinkedList list=new LinkedList();
        list.add(98);
        list.add(87);
        list.add(2);


        System.out.println(list);

        list.set(0,30);
        System.out.println(list);


    }
}
