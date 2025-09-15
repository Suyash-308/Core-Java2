package Multi_Threading;

public class Demo1 {
    public static void main(String[] args){
        class Weather implements Runnable{
            @Override
            public void run() {
                System.out.println("Traditional Way");
            }
        }
        Runnable a=new Weather();
        a.run();



        Runnable b=new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Way");
            }
        };
        b.run();


        Runnable c=()->System.out.println("Lambda Expression");
        c.run();
    }
}
