class MyThread extends Thread{
    

      public void run(){
         System.out.println(getName());  
         System.out.println(Thread.currentThread());    
             }
         }

class ThreadGroup{
      public static void main(String args[]){
             MyThread obj=new MyThread();
             obj.start();
             obj.setName("ABC");
              System.out.println(Thread.currentThread());
              System.out.println(Thread.currentThread().getThreadGroup());
              System.out.println(Thread.currentThread().getName());
            }
        }