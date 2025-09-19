package Collection_Framework.ArrayList;

import java.util.ArrayList;

public class DemoSearch {
    public static void main(String[] args){
        ArrayList arrayList=new ArrayList<>();
        arrayList.add("Hii");
        arrayList.add("Hello");
        arrayList.add("Welcome");



        System.out.println(arrayList);
//   Check the  single element are present or not in collection
        System.out.println(arrayList.contains("Hii"));


//   Check the  Multiple elements are present or not in collection   //   It returns true or false

        ArrayList containsList=new ArrayList<>();
        containsList.add("Welcome");
        containsList.add("Hello");

        System.out.println(arrayList.containsAll(containsList));



    }
}
