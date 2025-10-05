package Multi_Threading;

public class DemoPrintEvenOdd {
    public static void main(String[] args) {

        class EvenOdd  {
            int i = 1;
            final int limit = 10;

            public synchronized void odd(){
                while (i<=limit){
                    while (i%2==0) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                        if (i<=limit){
                            System.out.println("Odd : "+i);
                            i++;
                            notify();
                        }
                    }
                };

                public synchronized void even(){
                while (i<=limit){
                    while (i%2==1){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (i<=limit){
                        System.out.println("Even : "+i);
                        i++;
                        notify();
                    }
                }
                }
        }

        EvenOdd e=new EvenOdd();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
               e.odd();
            }
        };
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                e.even();
            }
        };
        Thread thread=new Thread(runnable);
        Thread thread1=new Thread(runnable1);

        thread.start();
        thread1.start();
    }
}
