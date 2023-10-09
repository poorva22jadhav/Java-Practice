class MyThread extends Thread{
      MyThread(ThreadGroup tg,String str){
               super(tg,str);
            }

       public void run(){
              System.out.println(Thread.currentThread());
 
              try{
                  Thread.sleep(5000);
                 }

              catch(InterruptedException ie){
                    System.out.println("Interrupted "+ getName());
                 }
           }
       }

class ThreadGpDemo{
      public static void main(String args[])throws InterruptedException{
             ThreadGroup tg=new ThreadGroup("India");
             MyThread mt1=new MyThread(tg,"Maharashtra");
             MyThread mt2=new MyThread(tg,"Karnataka");
             MyThread mt3=new MyThread(tg,"Telangna");
            

             ThreadGroup tg1=new ThreadGroup("America");
             MyThread mt4=new MyThread(tg1,"LA");
             MyThread mt5=new MyThread(tg1,"Washington");
             MyThread mt6=new MyThread(tg1,"Francisko");
           


             mt1.start();
             mt2.start();
             mt3.start();
            mt4.start();
             mt5.start();
            mt6.start();
             System.out.println(tg.activeCount());
             tg.interrupt();
               System.out.println(tg1.activeCount());

         }
      }
       
             
 