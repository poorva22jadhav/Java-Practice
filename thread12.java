class MyThread implements Runnable{
      public void run(){
             System.out.println(Thread.currentThread());


              try{
                  Thread.sleep(5000);
                 }

             catch(InterruptedException ie){
                   
                          }
                      }
                 }


class ThreadGroupDemo{
      public static void main(String args[])throws InterruptedException{
             ThreadGroup th=new ThreadGroup("India");

             MyThread obj1=new MyThread();
             MyThread obj2=new MyThread();

             Thread t1=new Thread(th,obj1,"maha");
             Thread t2=new Thread(th,obj2,"Goa");

             t1.start();
             t2.start();

             }
          }

