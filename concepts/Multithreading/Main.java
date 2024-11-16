// Thread Lifecycle
// Threads have a lifecycle that includes these states:

// New: Thread is created but not yet started.
// Runnable: Thread is ready to run but waiting for CPU time.
// Running: Thread is executing.
// Blocked/Waiting: Thread is waiting for resources or another thread to complete.
// Terminated: Thread has finished execution.

// Common Multithreading Issues
// Race Conditions: Occurs when two or more threads access shared resources simultaneously and interfere with each other’s operations.
// Deadlocks: Occurs when two threads wait for each other to release resources, causing both to freeze.
// Thread Safety: Ensure shared resources are accessed in a synchronized manner to prevent data corruption.

public class Main {

    public static void main(String[] args) {

        // option 1 of creating a thread: extending the thread class
        MyThread thr = new MyThread();
        thr.start();

        // option 2: implementing the Runnable class
        Thread threadFromRunnable = new Thread(new MyRunnable());
        threadFromRunnable.start();

        Thread thread1 = new Thread(new MyRunnable());
        thread1.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY, NORM_PRIORITY, MIN_PRIORITY
        thread1.start();

    }

}
