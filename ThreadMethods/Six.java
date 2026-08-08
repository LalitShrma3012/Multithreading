package ThreadMethods;

public class Six{

    public static void main(String[] args) throws InterruptedException{

        System.out.println("Main Thread starts");

        Thread t1 = new Thread(
            () -> {
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){}
                System.out.println("Thread-0 starts");
            }
        );

        t1.start();

        // t1.join();  // Let t1 completes its execution then main thread will continue. Till that time main is in the WAITING state.

        t1.join(1000); // Let wait for t1 to finish it's execution under the time pass, if takes longer than start you execution.

        System.out.println("Main thread ends");
    }
}

// join() and join(duration) 