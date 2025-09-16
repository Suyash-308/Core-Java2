package Multi_Threading;

public class Demo6 {
    public static void main(String[] args){
        class Worker extends Thread{
            @Override
            public void run() {
                for (int i=0;i<=10;i++){
                    System.out.println(i+ " "+ Thread.currentThread().getName());
                }
            }
        }
        Worker worker=new Worker();
//        worker.run();// when call run() without calling start() then only main thread will be executed not  Sub class of thread

        for(int i=0;i<=10;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }


    }
}
