package Multi_Threading;

public class Demo15 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <=10 ; i++) {
            Thread .sleep(3000);
            System.out.println(i);
        }
    }
}
