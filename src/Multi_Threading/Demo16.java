package Multi_Threading;

public class Demo16 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i <=10 ; i++) {
                System.out.println(i+"\t"+Thread.currentThread().getName());
            }
        },"t1");
        t1.start();
        t1.join();


        for (int i = 0; i <=10; i++) {
            System.out.println(i+"\t"+Thread.currentThread().getName());
        }
    }
}
