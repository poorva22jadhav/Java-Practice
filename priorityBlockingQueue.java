import java.util.concurrent.PriorityBlockingQueue;

class priorityBlockingQueueDemo{
      public static void main(String args[]){
            PriorityBlockingQueue  bq=new PriorityBlockingQueue();
             bq.offer(10);
             bq.offer(20);
             bq.offer(30);
             bq.offer(40);
             System.out.println(bq);
             }
          }