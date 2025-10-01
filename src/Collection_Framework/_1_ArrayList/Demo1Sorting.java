package Collection_Framework._1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1Sorting {
    public static void main(String[] args){
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(62);
        arrayList.add(80);
        arrayList.add(12);
        arrayList.add(54);

        System.out.println(arrayList);

        Collections.sort(arrayList);

        System.out.println(arrayList);

    }
}
