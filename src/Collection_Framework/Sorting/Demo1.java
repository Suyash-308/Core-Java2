package Collection_Framework.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args){
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(23);
        list.add(3);
        list.add(76);
        list.add(21);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


    }
}
