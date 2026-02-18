package Threads;

// class printHI{
//     public void show(){
//         for (int i = 0; i <=10; i++) {
//             System.out.println("Hi....");
//         }
//     }
// }
// class printHello{
//     public void show(){
//         for (int i = 0; i <=10; i++) {
//             System.out.println("Hello....");
//         }
//     }
// }

/// Thread extends class must have run method
/// Which will execute the all functionality execute
// class printHI extends Thread {
//     public void run() {
//         for (int i = 0; i <= 15; i++) {
//             System.out.println("Hi....");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class printHello extends Thread {
//     public void run() {
//         for (int i = 0; i <= 15; i++) {
//             System.out.println("Hello....");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

///////// Another way to create threads through Runnable
/// The Thread class implements the Runable interfaces
/// Runnable interfaces do not have thread methods in that case we have to create the threads

class printHI implements Runnable {
    public void run() {
        for (int i = 0; i <= 15; i++) {
            System.out.println("Hi....");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class printHello implements Runnable {
    public void run() {
        for (int i = 0; i <= 15; i++) {
            System.out.println("Hello....");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threadd {
    public static void main(String[] args) {
        // printHI obj1 = new printHI();
        // printHello obj2 = new printHello();
        // It prints all the Hi and then all Hello
        // Sequentially
        // obj1.show();
        // obj2.show();

        // In parallel, we achieve by threads
        // Print the Thread priority value
        // Priority range lies between 1 (Lowest) - 10 (Highest)

        // System.out.println(obj2.getPriority());

        // Set the priority of the threads

        // obj2.setPriority(obj2.MAX_PRIORITY);
        // obj1.start();
        // try {
        // Thread.sleep(5);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // obj2.start();

        ////// For second method of creating threads through runnable
        Runnable obj1 = new printHI();
        Runnable obj2 = new printHello();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t2.start();
        
        // Using the lambda function with this
        
        // Runnable obj3 = new Runnable() {
        //     public void run() {
        //         for (int i = 0; i <= 15; i++) {
        //             System.out.println("Bye....");
        //             try {
        //                 Thread.sleep(10);
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // };
        // above tranformed
        Runnable obj3 = () -> {
                for (int i = 0; i <= 15; i++) {
                    System.out.println("Bye....");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };
        Thread t3 = new Thread(obj3);

        t3.start();

    }
}
