// Preferred over extending Thread as it allows you to extend other classes.

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("The thread from runnable is running");
    }
}
