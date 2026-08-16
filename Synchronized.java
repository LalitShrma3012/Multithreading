public class Synchronized {
    
    public static void main(String[] args) {
        Test t = new Test();
        Thread t1 = new Thread(
            () ->{
                try{
                    t.m1();
                }catch(Exception e){}
            }
        );
        Thread t2 = new Thread(
            () ->{
                try{
                    t.m2();
                }catch(Exception e){}
            }
        );

        t1.start();
        t2.start();
    
    }
}


class Test{

    synchronized void show()throws Exception{
        System.out.println(Thread.currentThread().getName() + "enters show!!");
        System.out.println(Thread.currentThread().getName() + "Inside show");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + "Show Finished");
        System.out.println(Thread.currentThread().getName() + "exits show!!");
    }

    synchronized void m1(){
        System.out.println(Thread.currentThread().getName() + "enters m1");

        try{
            Thread.sleep(2000);
        }catch(Exception e){}

        System.out.println(Thread.currentThread().getName() + "exits m1");

    }
    synchronized void m2(){
        System.out.println(Thread.currentThread().getName() + "enters m2");
        
        try{
            Thread.sleep(2000);
        }catch(Exception e){}

        System.out.println(Thread.currentThread().getName() + "exits m2");
    }
    
}