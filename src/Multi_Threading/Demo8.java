package Multi_Threading;

public class Demo8 {
    public static void main(String[] args){
        // Anonymous Way
        Runnable worker=new Runnable() {
            @Override
            public void run() {
                System.out.println("thread"+Thread.currentThread().getName());
            }
        };

        Thread thread=new Thread(worker,"worker");
        thread.start();


        System.out.println("main logic"+Thread.currentThread().getName());


    }
}
