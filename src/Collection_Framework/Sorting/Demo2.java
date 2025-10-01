package Collection_Framework.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args){
        List<String>list=new ArrayList<>();
        list.add("suyash");
        list.add("alice");
        list.add("ram");
        list.add("shyam");
        list.add("legend");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
