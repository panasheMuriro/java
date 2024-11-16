// LESSON OBJECTIVES

// Understand what multithreading is and why it’s useful.
// Learn how to create and run threads in Java.
// Explore basic thread management techniques.

// What is Multithreading?
// Multithreading is the ability of a program to execute multiple threads simultaneously. 
// Threads are lightweight subprocesses that share the same memory space but run independently.

// Why Use Multithreading?

// Concurrency: Perform multiple tasks simultaneously (e.g., downloading a file while updating a UI).
// Performance: Utilize multi-core CPUs effectively.
// Responsiveness: Keep applications responsive (e.g., avoiding UI freezes).


// The run method contains the code to be executed in the thread.
// Use start() to begin execution (calls run internally).

public class MyThread extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Thread is running");
    }

}

