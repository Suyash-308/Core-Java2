package Multi_Threading;

public class Demo9 {
    public static void main(String[] args)  {
        Runnable worker=()->System.out.println("Custom thread :"+"\t"+Thread.currentThread().getName());

        Thread thread=new Thread(worker,"worker");
        thread.start();



        System.out.println("Main method logic : " +Thread.currentThread().getName());
    }
}
