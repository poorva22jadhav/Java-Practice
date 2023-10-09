import java.util.concurrent.*;

class MyThread implements Runnable{
      int num;
       
      MyThread(int num){
         this.num=num;
           }


      public void run(){
            System.out.println(Thread.currentThread()+"start thread "+num);

            dailyTask();

            System.out.println(Thread.currentThread()+"end thread "+num);

                        }


   void dailyTask(){
        try{
           Thread.sleep(8000);
           }

        catch(InterruptedException ie){
              }

          }
       }

class ThreadPoolDemo{
      public static void main(String args[]){

              ExecutorService ser=Executors.newCachedThreadPool();

              for(int i=1;i<=6;i++){
                  MyThread obj=new MyThread(i);
                  ser.execute(obj);

                       }

             ser.shutdown();
                   }
             }