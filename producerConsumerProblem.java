import java.util.concurrent.*;

class producer implements Runnable{
      BlockingQueue que=null;

      producer(BlockingQueue que){
              this.que=que;
              }

      public void run(){
             for(int i=1;i<=10;i++){
                 try{
                    que.put(i);
                    System.out.println("produce "+i);
                   }
                 catch(InterruptedException ie){
                      }
               
                 try{
                     Thread.sleep(1000);
                    }
                  
                 catch(InterruptedException ie){
                       }

          
                  }
            
             }
         }

class consumer implements Runnable{
      BlockingQueue que=null;

      consumer(BlockingQueue que){
              this.que=que;
              }

      public void run(){
             for(int i=1;i<=10;i++){
                 try{
                    que.take();
                    System.out.println("consume "+i);
                   }
                 catch(InterruptedException ie){
                      }
                  
               
                  }
             }
         }

class producerConsumer{
     public static void main(String args[]){
            BlockingQueue que=new ArrayBlockingQueue(3);

            producer produce=new producer(que);
            consumer consume=new consumer(que);

            Thread produceThread=new Thread(produce);
            Thread consumeThread=new Thread(consume);

            produceThread.start();
            consumeThread.start();
        }
     }
