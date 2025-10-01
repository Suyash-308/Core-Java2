package Collection_Framework.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoCustomStudent {
    public static void main(String[] args){
        List<Student>students=new ArrayList<>();

        Student student1=new Student(9,"Ram");
        Student student2=new Student(53,"Shyam");
        Student student3=new Student(45,"Hanuman");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println("Before Sorting");
        students.forEach(System.out::println);

         System.out.println("\n");

        Collections .sort(students);
        System.out.println("After Sorting");
        students.forEach(System.out::println);

    }
}
