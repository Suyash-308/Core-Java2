package Multi_Threading;

public class Demo10 {
    public static void main(String[] args){


        class Worker implements  Runnable{
            @Override
            public void run() {
                System.out.println("Traditional Way");
            }
        }
        Worker worker=new Worker();
        worker.run();



        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Way");
            }
        };
        runnable.run();


        Runnable runnable1=()->System.out.println("Lambda Expression");
        runnable1.run();

    }
}
