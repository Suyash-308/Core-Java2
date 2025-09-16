package Multi_Threading;

public class Demo17 {
    public static void main(String[] args){
        Thread t1=new Thread(()->{
            m2();
        },"t1");
        t1.start();

        m1();
    }

    private static void m1() {
        System.out.println("m1 "+Thread.currentThread().getName());
        m2();
    }

    private static void m2() {
        System.out.println("m2 "+Thread.currentThread().getName());
        m3();
    }

    private static void m3() {
        System.out.println("m3 "+Thread.currentThread().getName());
    }
}
