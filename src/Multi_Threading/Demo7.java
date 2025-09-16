package Multi_Threading;

public class Demo7 {
    public static void main(String[] args){
        class  Worker implements Runnable{
            @Override
            public void run() {
                for (int i=1;i<=10;i++){
                    System.out.println(i+"\t"+Thread.currentThread().getName());
                }
            }
        }
        Worker worker=new Worker();
        Thread thread=new Thread(worker,"worker");
        thread.start();


        for (int i=1;i<=10;i++){
            System.out.println(i+"\t"+Thread.currentThread().getName());
        }
    }
}
