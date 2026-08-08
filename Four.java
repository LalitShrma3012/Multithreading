/*
Thread lifecycle and how can we see that a particular thread is in which state.
*/



public class Four{
    public static void main(String[] args) {
        
        // getting the reference of the main thread
        Thread mainThread = Thread.currentThread();

        // printing in which state the main thread is
        System.out.println("Main Thread state is - "+ mainThread.getState());

        // Creating a new thread using Runnable interface lambda reference.
        Thread t1 = new Thread(
            () -> {

                // printing current executing thread name.
                System.out.println("Current thread running - " + Thread.currentThread().getName()); // Thread-0

                // printing the main thread state while created thread get executed.
                System.out.println("Main Thread state is - "+ mainThread.getState()); // TIMED_WAITING
            }
        );

        // printing the name and state of created state before calling start.
        System.out.println("Thread name is - "+ t1.getName()+" state is - " + t1.getState()); // Thread-0, NEW

        // calling start for created thread.
        t1.start();
        
        // printing in which state is the created thread is after calling start() 
        System.out.println(t1.getState()); // RUNNABLE
        
        try{
            Thread.sleep(2000);  // calling sleep so that main thread can wait for 2 sec for t1 to get executed.
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        // printing created thread state
        System.out.println(t1.getState());  // TERMINATED


        // printing main thread state 
        System.out.println("Main Thread state is - "+ mainThread.getState());  // RUNNABLE



    }
}