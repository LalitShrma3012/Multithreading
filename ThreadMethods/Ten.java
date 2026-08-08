package ThreadMethods;

public class Ten {
    public static void main(String[] args) {
          Thread t1 = new Thread(
            () -> {
                System.out.println(Thread.currentThread().getName());
            }
          );

          t1.setName("worker-1");

          t1.start();
    }
}

/*
    Thread.currentThread() -> returns the reference of the current running thread. It's a static method. 
*/
