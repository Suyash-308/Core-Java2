package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.function.Predicate;

public class DemoRemoveIf {
    public static void main(String[] args){
        ArrayList arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(18);
        arrayList.add(19);
        arrayList.add(20);



        System.out.println(arrayList);


        Predicate<Integer> evenRemoval=X->X % 2 == 0;

        arrayList.removeIf(evenRemoval);
        System.out.println(arrayList);




    }
}
