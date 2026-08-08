// Indeterministic behaviour of two threads while execution.

public class Third {
    public static void main(String[] args){

        Thread t1 = new Thread(
            () -> {
                for(int i=0;i<1000;i++){
                    System.out.println("Character is moving forward!!");
                }
            }
        );

        Thread t2 = new Thread(
            () -> {
                for(int i=0;i<1000;i++){
                    System.out.println("Footstep sound!!");
                }
            }
        );

        t1.start();
        t2.start();
    }
}