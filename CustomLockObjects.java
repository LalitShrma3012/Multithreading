public class CustomLockObjects {
    public static void main(String[] args) {

        Bank b1 = new Bank();

        Thread t1 = new Thread(() -> b1.deposite());

        Thread t2 = new Thread(() -> b1.withdraw());

        t1.start();
        t2.start();
    }
}


class Bank{

    Object lock1 = new Object();
    Object lock2 = new Object();

    void deposite(){
        synchronized(lock1) 
        {
            System.out.println(Thread.currentThread().getName() + " enter bank to deposite!");
            try{
                Thread.sleep(2000);
            }catch(Exception e){}
            System.out.println(Thread.currentThread().getName() + " depositing money");
            System.out.println(Thread.currentThread().getName() + " exit bank after deposite!");
        }
    }

   void withdraw(){
        synchronized(lock2){
            System.out.println(Thread.currentThread().getName() + " enter bank to withdraw!");
            try{
                Thread.sleep(2000);
            }catch(Exception e){}
            System.out.println(Thread.currentThread().getName() + " withdrawing money");
            System.out.println(Thread.currentThread().getName() + " exit bank after withdraw!");
        }
    }
}