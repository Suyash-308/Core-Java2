package Collection_Framework._1_ArrayList;

import java.util.ArrayList;

public class DemoRemoval {
    public static void  main(String[] args){
        ArrayList arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(13);
        arrayList.add(50);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add("Hii");
        arrayList.add("Hello");
        arrayList.add(14);
        arrayList.add(51);
        arrayList.add(21);
        arrayList.add(14);


        System.out.println(arrayList);


        arrayList.remove(0);
        System.out.println(arrayList);


        arrayList.remove("Hii");
        System.out.println(arrayList);


        ArrayList listCollection=new ArrayList();
        listCollection.add(50);
        listCollection.add("Hello");

        arrayList.removeAll(listCollection);
        System.out.println(arrayList);


        ArrayList listRetain=new ArrayList();
        listRetain.add(13);

        arrayList.retainAll(listRetain);
        System.out.println(arrayList);







    }
}
