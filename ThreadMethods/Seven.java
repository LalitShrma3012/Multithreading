package ThreadMethods;
public class Seven {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(
            () -> {
                for(int i=1;i<=10;i++){
                    System.out.println("T1 : "+ i);
                    Thread.yield();
                }
            }
        );

        Thread t2 = new Thread(
            () -> {
                for(int i=1;i<=10;i++){
                    System.out.println("T2 : "+ i);
                }
            }
        );

        t1.start();
        t2.start();
    }
}



// yield() -> static method so can called using class Thread (e.g. Thread.yield)
// This methods willing to give the CPU time to someone else with same priority and that wants to run.

// 1. OS can reject this because 

// 2. It is like a suggestion to OS scheduling algorithms, but They can easily reject it like non-valued suggestion.

// 3. Current thread on which this method gets called doesn't go to WAITING, TIMED_WAITING or BLOCKED state. It does go to only RUNNABLE state.