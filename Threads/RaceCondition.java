package Threads;

class Counter
{
    int count;
    // method will be access by one thread at the time
    public synchronized void increment()
    {
        count++;
    };
}
public class RaceCondition {
    public static void main(String[] args) 
    {
        Counter c = new Counter();
        Runnable obj1 = () ->
        {
            for (int i = 0; i <10000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () ->
        {
            for (int i = 0; i <10000; i++) {
                c.increment();
                
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // Used in multithreading to pause the current thread's execution until the specified thread terminates.
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c.count);
    }
}
