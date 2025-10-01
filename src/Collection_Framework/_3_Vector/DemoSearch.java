package Collection_Framework._3_Vector;

import java.util.Vector;

public class DemoSearch {
    public static void main(String[] args){
        Vector vector=new Vector<>();
        vector.add(20);
        vector.add(21);
        vector.add(22);
        vector.add(23);
        vector.add(24);
        vector.add(25);
        vector.add(26);

        System.out.println(vector.contains(20));

        System.out.println(vector.contains(30));



        Vector containsList=new Vector<>();
        containsList.add(21);
        containsList.add(23);
        containsList.add(26);

        System.out.println(vector.containsAll(containsList));










    }
}
