package ProblemsInMultiThreading;

public class VisibilityIssue {

    static volatile boolean flag = false;
    // volatile keyword makes this flag volatile means whichever thread wants to read the value of flag, always read from RAM.
    public static void main(String[] args) {
        
        
        Thread t1 = new Thread(
            () -> {
                try{
                    Thread.sleep(500);
                }catch(Exception e){}
                flag = true;
            }
        );

        Thread t2 = new Thread(
            ()->{
                while(!flag){
                    // System.out.println("Thread 2 is running!!!");
                }
                System.out.println("Thread 2 is finished!");
            }
        );

        t1.start();
        t2.start();

    }
}