package String;

public class EqualTo {
    public static void main(String[] args){
        String str1=new String("Hello");
        String str2=new String("Hello");
        String str3="welcome";
        String str4="welcome";
        String str5="Hello";


        System.out.println(str1 == str2);
        System.out.println(str1 == str5);
        System.out.println(str3 == str4);
        System.out.println(str2 == str5);



    }

}
