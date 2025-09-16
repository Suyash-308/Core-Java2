package Multi_Threading;

public class Demo12 {
    public static void main(String[] args) {

        Thread a = new Thread(() ->
                System.out.println("a"), "a");
        a.start();


        Thread b = new Thread(() -> {
            System.out.println("b");
        }, "b");
        b.start();


        Thread c = new Thread(() -> System.out.println("Custom thread default name : " + Thread.currentThread().getName()));
         c.start();
    }
}
