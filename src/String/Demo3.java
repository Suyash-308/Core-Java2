package String;

public class Demo3 {
    public static void main (String[] args){
        String s1=new String("hello");
        String s2=new String("hello");
        String s3="welcome";
        String s4="welcome";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));


    }
}
