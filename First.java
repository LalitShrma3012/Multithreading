public class First{
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t2.start();
        t1.start();
    }
}

class MyThread1 extends Thread{

    @Override 
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println("Thread using thread 1 class");
        }
    }
}

class MyThread2 extends Thread{

    @Override 
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println("Thread using thread 2 class");
        }
    }
}