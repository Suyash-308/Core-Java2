package Collection_Framework._1_ArrayList;

import java.util.ArrayList;

public class Demo2Insertion {
    public static void main(String[] args){
        ArrayList arrayList=new ArrayList();
        System.out.println(arrayList);

        arrayList.add(100);
        System.out.println(arrayList);

        arrayList.add(0,400);
        System.out.println(arrayList);

        ArrayList listCollection=new ArrayList<>();
        listCollection.add(12);
        listCollection.add(90);
        listCollection.add(27);

        arrayList.addAll(listCollection);
        System.out.println(arrayList);
    }
}
