package ProblemsInMultiThreading;

public class AtomicityProblem{
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new Thread(
            () -> {
                System.out.println(Thread.currentThread().getName());
                try{
                    account.withdrawl(700);
                }catch(InterruptedException e){}
            }
        );


        Thread t2 = new Thread(
            () -> {
                System.out.println(Thread.currentThread().getName());
                try{
                account.withdrawl(700);
                }catch(InterruptedException e){}
            }
        );

        t1.start();
        t2.start();
    
        t1.join();
        t2.join();
    

        System.out.println("Final Balance - " + account.getBalance());
    }
}




class BankAccount{
    private int balance;
    public BankAccount(int balance){
        this.balance = balance;
    }

    public void withdrawl(int amount) throws InterruptedException
    {
        if(this.balance>=amount){
            Thread.currentThread();
            Thread.sleep(100);
            this.balance -= amount;
        }
    }

    public int getBalance(){
        return this.balance;
    }
}