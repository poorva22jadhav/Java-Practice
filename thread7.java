class MyThread extends Thread{
      static Thread Nmain=null;

      public void run(){
             try{
                Nmain.join();
                }
            
             catch(InterruptedException ie){
                  }

             for(int i=0;i<10;i++){
                System.out.println("In thread-0");
                  }
            }
        }

class ThreadDemo{
       public static void main(String args[])throws InterruptedException{
              MyThread.Nmain=Thread.currentThread();

             MyThread obj=new MyThread();
             obj.start();

             obj.join();

             for(int i=0;i<10;i++){
                 System.out.println("In Main");
                    }
              }
          }
