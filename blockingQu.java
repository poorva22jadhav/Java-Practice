import java.util.concurrent.*;
import java.util.*;
class BlockingqueueDemo{
      public static void main(String args[])throws InterruptedException{
             BlockingQueue bq=new ArrayBlockingQueue(3);
             bq.put(10);
             bq.put(20);
             bq.put(30);
            
             System.out.println(bq);
             ArrayList al=new ArrayList();
             bq.drainTo(al);
             System.out.println("Arraylist"+al);
             System.out.println(bq);
           
             
             
             
             }
          }
             