package Collection_Framework.Sorting;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(){}

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){

        this.name=name;
    }



    @Override
    public String toString() {
        return "id:"+id+"name:"+name;
    }

    @Override
    public int compareTo(Student student) {
        return  this.name.compareTo(student.name);
    }
}
