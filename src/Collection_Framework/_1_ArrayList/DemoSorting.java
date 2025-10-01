package Collection_Framework._1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class DemoSorting {
    public  static void main(String[] args){
        ArrayList arrayList=new ArrayList();
        arrayList.add("Suyash");
        arrayList.add("Karan");
        arrayList.add("Manoj");
        arrayList.add("Ram");
        arrayList.add("Vishnu");
        arrayList.add("arnav");

        // Small char contain high value


        System.out.println(arrayList);

        Collections.sort(arrayList);

        System.out.println(arrayList);

    }
}
