import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.*;

class Employee implements Comparable{
        String name;
         
        Employee(String name){
                this.name=name;
               }

       public String toString(){
              return name;
             }

       public int compareTo(Object obj){
              Employee obj1=(Employee)obj;
              return name.compareTo(obj1.name);
            }
         }
      






class priorityBQDemo{
      public static void main(String args[])throws InterruptedException{
             BlockingQueue bq = new PriorityBlockingQueue(3);

             bq.offer(new Employee("Citadel"));
             bq.offer(new Employee("Akanksha"));
             bq.offer(new Employee("Daisy"));
             bq.offer(new Employee("Bipasha"));

             System.out.println(bq);
             }
          }