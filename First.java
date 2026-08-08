// Thread Creation using Thread class.

public class First {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println("Current Thread - " + Thread.currentThread().getName());
        t1.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Current Thread - " + Thread.currentThread().getName());
        for(int i=0;i<100;i++){
            System.out.println("Welcome to multithreading!");
        }
    }
}
