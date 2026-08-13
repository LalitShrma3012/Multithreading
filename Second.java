/*
Thread Creation using Runnable interface and benefits of using Runnable interface over Thread class.
*/

public class Second{
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        System.out.println("Current thread running is - " + Thread.currentThread().getName());
        t1.start();
    }
}


class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Current thread running is - " + Thread.currentThread().getName());
        for(int i=0;i<100;i++){
            System.out.println("Thread using runnable interface is running!");
        }
    }
}

/*
Benefits of using Runnable Interface over Thread class
1. Class which implements Runnable can extend another class implement other interfaces as well. So class can live like a normal class, It just overrides the run() method of Runnable that help it to run as a thread.
2. Code Reusability : Reference of class which implements Runnable can be passed to multiple threads.
*/