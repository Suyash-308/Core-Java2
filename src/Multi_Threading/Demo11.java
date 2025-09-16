package Multi_Threading;

public class Demo11 {
    public static void main(String[] args) throws InterruptedException {
        Runnable worker=()->{
            for (int i = 1; i <=100 ; i=i+2) {
                System.out.println(i+"\t"+Thread.currentThread().getName());
            }
        };
        Thread odd=new Thread(worker,"Odd-thread");
        odd.start();


        Thread even=new Thread(()->{
            for (int i =0; i <=100 ;i=i+2) {
            System.out.println(i+"\t"+Thread.currentThread().getName());
        }},"Even-thread");
        even.start();




    }
}
