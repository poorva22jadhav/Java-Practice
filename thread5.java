class MyRunnable implements Runnable{
      public void run(){
             for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName() +": Count-"+ i);
                try{
                    Thread.sleep(500);
                   }

                catch(InterruptedException ie){
                      System.out.println("Interruption happen");
                      }
                  }
              }
         }

class ThreadPriority{
      public static void main(String args[]){
             MyRunnable mr= new MyRunnable();
             Thread th=new Thread(mr,"Thread-1");
             

             th.start();
             th.start();  //IllegealThreadStateException
            

             th.setPriority(-1);      // IllegealArgumentException
          
      }   }   