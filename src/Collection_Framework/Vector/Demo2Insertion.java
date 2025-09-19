package Collection_Framework.Vector;

import java.util.Vector;

public class Demo2Insertion {
        public static void main(String[] args){
            Vector vector=new Vector();

            vector.add(10);
            vector.add(11);
            vector.add(12);
            vector.add(13);
            vector.add(14);

            System.out.println(vector);

            vector.addFirst(90);
            System.out.println(vector);

            vector.addLast(55);
            System.out.println(vector);

            vector.add(1,85);
            System.out.println(vector);


            Vector addList=new Vector();
            vector.add(20);
            vector.add(30);
            vector.add(40);

            vector.addAll(addList);
            System.out.println(vector);



        }
    }

