package Multi_Threading;

public class Demo13 {
    public static void main(String[] args){
        Thread t1=new Thread(()->System.out.println("t1"),"t1");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();


        for (int i = 0; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }

        System.out.println("main thread priority "+Thread.currentThread().getPriority());

        System.out.println("t1 thread priority "+t1.getPriority());
    }
}
