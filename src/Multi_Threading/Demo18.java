package Multi_Threading;

public class Demo18 {
    public static void main(String[] args){
        Thread t1=new Thread(()->{
            System.out.println(10/0);
        });

        Thread t2=new Thread(()->{
            System.out.println(10/2);
        });

        Thread t3=new Thread(()->{
            System.out.println(10/5);
        });

// When exception one thread ,they are  not cause execution of  other threads

        t1.start();
        t2.start();
        t3.start();
    }
}
