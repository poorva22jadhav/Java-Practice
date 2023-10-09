class MyThread extends Thread {
    MyThread(ThreadGroup tg, String str) {
        super(tg, str);
    }

    public void run() {
        System.out.println(Thread.currentThread());
    }
}
 class Main {
    public static void main(String args[]) {
        ThreadGroup customThreadGroup = new ThreadGroup("C2W");

        MyThread th = new MyThread(customThreadGroup, "java");
        MyThread th1 = new MyThread(customThreadGroup, "DSA");
        MyThread th2 = new MyThread(customThreadGroup, "CPP");
        MyThread th3 = new MyThread(customThreadGroup, "WEB DEV");

        th.start();
        th1.start();
        th2.start();
        th3.start();
    }
}

