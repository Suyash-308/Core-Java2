package Collection_Framework.Vector;

import java.util.Vector;

public class DemoUpdate {
    public static void main(String[] args){
        Vector vector=new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);


        System.out.println(vector);

        vector.set(0,1);
        vector.set(3,88);

        System.out.println(vector);
    }
}
