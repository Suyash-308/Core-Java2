package Multi_Threading;

public class Demo19 {
    public static void main(String[] args){
        class s implements Runnable{
            @Override
            public void run() {
                System.out.println("S");
            }
        }
        s a=new s();
        Thread thread=new Thread(a);
        a.run();

//        thread.start();
    }
}
