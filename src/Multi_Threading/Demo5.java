package Multi_Threading;

public class Demo5 {
    public static void main (String[] args) throws InterruptedException {
        class Worker extends Thread{
            @Override
            public void run() {
                for (int i=0;i<=10;i++){
                    System.out.println(i+" "+Thread.currentThread().getName());
                }
            }
        }
        Worker worker=new Worker();
        worker.start();


        System.out.println("Main method : "+Thread.currentThread().getName());

    }
}
