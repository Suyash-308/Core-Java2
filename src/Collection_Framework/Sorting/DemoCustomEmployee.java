package Collection_Framework.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoCustomEmployee {
    public static void main(String[] args){
        List<Employee>list=new ArrayList<Employee>();

        Employee employee1=new Employee(1, "Subhash", 50000);
        Employee employee2=new Employee(90, "Manoj", 30000);
        Employee employee3=new Employee(56, "Alice", 30000);
        Employee employee4=new Employee(244, "Shyam", 30000);
        Employee employee5=new Employee(2, "Ram", 30000);
        Employee employee6=new Employee(21, "Karan", 30000);
        Employee employee7=new Employee(23, "Hanuman",30000);


        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.add(employee6);
        list.add(employee7);

        System.out.println("Print before sorting"+"\n");
        list.forEach(System.out::println);

        System.out.println("\n"+"Print after sorting"+"\n");
        Collections.sort(list);
        list.forEach(System.out::println);



    }
}
