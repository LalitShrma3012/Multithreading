package ThreadMethods;

public class Five{

    public static void main(String[] args){

        System.out.println("Main thread starts");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}

        System.out.println("Main thread ends");
    }
}

// sleep() is used to stop the execution of current thread for a given time.