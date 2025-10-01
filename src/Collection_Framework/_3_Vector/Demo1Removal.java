package Collection_Framework._3_Vector;

import java.util.Vector;

public class Demo1Removal {
    public static void main(String[] args){
        Vector vector=new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        vector.add(70);
        vector.add(80);

        System.out.println(vector);

        vector.remove(0);
        System.out.println(vector);

        vector.removeFirst();
        System.out.println(vector);

        vector.removeLast();
        System.out.println(vector);



        Vector vector1=new Vector();
        vector1.add(40);
        vector1.add(50);

        vector.removeAll(vector1);
        System.out.println(vector);



        Vector list=new Vector();
        list.add(30);
        list.add(60);

        vector.retainAll(list);
        System.out.println(vector);

        vector.clear();
        System.out.println(vector);











    }
}
