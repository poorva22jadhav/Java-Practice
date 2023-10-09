class MyThread implements Runnable{
      public void run(){
              System.out.println("In Run");
              System.out.println(Thread.currentThread().getName());
             }
         }


class ThreadDemo{
      public static void main(String args[]){
             MyThread obj=new MyThread();
             Thread th=new Thread(obj);
             th.start();
            }
          } 