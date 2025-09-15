package Multi_Threading;

public class Demo4 {
    public static void main(String[] args){
        Runnable runnable=()->System.out.println("Run Method : "+Thread.currentThread().getName());
        Thread thread=new Thread(runnable,"worker");
        thread.start();


        System.out.println("Main Method : "+Thread.currentThread().getName());
    }
}
