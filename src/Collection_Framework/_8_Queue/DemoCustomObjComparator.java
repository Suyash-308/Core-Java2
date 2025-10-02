package Collection_Framework._8_Queue;

import java.util.*;

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

        Queue<Student> studentList=new LinkedList<>();
        Student student1=new Student(29,"ram");
        Student student2=new Student(2,"hanuman");
        Student student3=new Student(76,"legend");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println(studentList.poll());
        System.out.println(studentList.poll());
        System.out.println(studentList.poll());
        System.out.println(studentList.poll());

    }
}
