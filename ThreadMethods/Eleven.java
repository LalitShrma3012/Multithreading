package ThreadMethods;

public class Eleven {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(
            () -> {
                System.out.println("Custom-1 thread is running");
            }
        );

        Thread t2 = new Thread(
            () -> {
                System.out.println("Custom-2 thread is running");
            }
        );

        t1.start();
        t2.start();
        t1.setPriority(10);
        // System.out.println(t1.getPriority());
    }
}
