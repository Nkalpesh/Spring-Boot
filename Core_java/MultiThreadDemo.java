class Counter {
    private int count = 0;

    // synchronized method to make it thread-safe
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

class MultiThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
