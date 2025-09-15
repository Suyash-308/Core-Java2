package Multi_Threading;

public class Demo3 {
    public static void main(String[] args){
        //Create Thread

        class Worker extends Thread{
            @Override
            public void run() {
                System.out.println("Run method "+ Thread.currentThread().getName());
            }
        }
        Worker worker=new Worker();
        worker.start();
        worker.setName("Run_Thread");

        System.out.println("Main method "+ Thread.currentThread().getName());
    }
}
