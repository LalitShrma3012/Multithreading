package ProblemsInMultiThreading;

public class VisibilityIssue {

    static boolean flag = false;
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
                    System.out.println("Thread 2 is running!!!");
                }
                System.out.println("Thread 2 is finished!");
            }
        );

        t1.start();
        t2.start();

    }
}