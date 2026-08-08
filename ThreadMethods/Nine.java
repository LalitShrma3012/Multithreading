package ThreadMethods;

public class Nine {
    
    public static void main(String[] args) throws InterruptedException{

        Runnable r1 = new Runnable(){
            @Override
            public void run(){
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){}
                System.out.println("Thread - 0 is running!");
            }
        };

        Thread t1 = new Thread(r1);

        System.out.println(t1.isAlive()); // false

        t1.start();

        System.out.println(t1.isAlive());  // true

        Thread.sleep(3000);

        System.out.println(t1.isAlive());  // false
    }
}

/*
isAlive()  --> checks whether a thread is alive or not. 
A thread is alive either it's in RUNNABLE state  or others came after RUNNABLE and before TERMINATED state.
*/