package Collection_Framework.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoCustomObjComparator {
    public static void main(String[] args){
        class Student{
            private int id;
            private String name;


            public Student(){}

            public Student(int id,String name){
                this.id=id;
                this.name=name;
            }

            @Override
            public String toString() {
                return "id:"+id+"\t" +"name:"+name;
            }
        }

        List<Student>studentList=new ArrayList<Student>();
        Student student1=new Student(29,"ram");
        Student student2=new Student(2,"hanuman");
        Student student3=new Student(76,"legend");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println("Before sorting");
        studentList.forEach(System.out::println);

        System.out.println("After Sorting");
        Comparator<Student> comparator=(Student s1,Student s2)->s1.name.compareTo(s2.name);
        Collections.sort(studentList,comparator);
        studentList.forEach(System.out::println);

    }
}
