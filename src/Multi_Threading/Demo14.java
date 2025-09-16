package Multi_Threading;

public class Demo14 {
    public static void  main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            for (int i =1; i <=100; i++) {
                System.out.println(i+"\t"+Thread.currentThread().getName());
            }
        },"t1");
        t1.start();
        t1.join();  //   Main wait for complete t1.


        for (int i = 0; i <=150 ; i++) {
            System.out.println(i+"\t"+Thread.currentThread().getName());

        }
    }
}
