package ar.edu.udeci.pv.threads;

/**
 * https://stackoverflow.com/questions/541487/implements-runnable-vs-extends-thread-in-java#:~:text=by%20extending%20Thread%2C%20each%20of,share%20the%20same%20object%20instance.&text=Output%20of%20the%20above%20program.&text=In%20the%20Runnable%20interface%20approach,been%20shared%20by%20different%20threads.
 */
public class ThreadVsRunnable {

    public static void main(String args[]) throws Exception {
        // Multiple threads share the same object.
        ImplementsRunnable rc = new ImplementsRunnable();
        Thread t1 = new Thread(rc);
        t1.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        Thread t2 = new Thread(rc);
        t2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        Thread t3 = new Thread(rc);
        t3.start();

        // Creating new instance for every thread access.
        ExtendsThread tc1 = new ExtendsThread();
        System.out.println("State tc1 " + tc1.getState());
        tc1.setPriority(7);
        tc1.start();
        System.out.println("State tc1 " + tc1.getState());
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        System.out.println("State tc1 " + tc1.getState());
        ExtendsThread tc2 = new ExtendsThread();
        tc2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        ExtendsThread tc3 = new ExtendsThread();
        tc3.start();
    }
}

//Implement Runnable Interface...
class ImplementsRunnable implements Runnable {

    private int counter = 0;

    public void run() {
        counter++;
        System.out.println("ImplementsRunnable : Counter : " + counter);
    }
}

//Extend Thread class...
class ExtendsThread extends Thread {

    private int counter = 0;

    public void run() {
        counter++;
        System.out.println("ExtendsThread : Counter : " + counter);
    }
}

/*

In the Runnable interface approach, only one instance of a class is being created and it has been shared by different
threads. So the value of counter is incremented for each and every thread access.

Whereas, Thread class approach, you must have to create separate instance for every thread access.
Hence different memory is allocated for every class instances and each has separate counter, the value remains same,
which means no increment will happen because none of the object reference is same.

When to use Runnable?
Use Runnable interface when you want to access the same resources from the group of threads. Avoid using Thread class
here, because multiple objects creation consumes more memory and it becomes a big performance overhead.

A class that implements Runnable is not a thread and just a class. For a Runnable to become a Thread, You need to create
an instance of Thread and passing itself in as the target.

In most cases, the Runnable interface should be used if you are only planning to override the run() method and no other
Thread methods. This is important because classes should not be subclassed unless the programmer intends on modifying or
enhancing the fundamental behavior of the class.

When there is a need to extend a superclass, implementing the Runnable interface is more appropriate than using the
Thread class. Because we can extend another class while implementing Runnable interface to make a thread.

*/
