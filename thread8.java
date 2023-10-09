class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + name + ": Count " + i);
            // Yielding the thread after each iteration
            Thread.yield();
        }
    }
}

 class ThreadYieldExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("A");
        MyThread thread2 = new MyThread("B");

        thread1.start();
        thread2.start();
    }
}
