import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.*;
import java.util.*;

class Employee{
        String name;
         
        Employee(String name){
                this.name=name;
               }

        public String toString(){
              return name;
             }
        }

class sortByName implements Comparator{

        public int compare(Object obj,Object obj2){
              Employee obj3=(Employee)obj;
              Employee obj4=(Employee)obj2;
              return obj3.name.compareTo(obj4.name);
            }

        
         }
      



class priorityBQDemo1{
      public static void main(String args[])throws InterruptedException{
             BlockingQueue bq = new PriorityBlockingQueue(4,new sortByName());

             bq.offer(new Employee("Citadel"));
             bq.offer(new Employee("Akanksha"));
             bq.offer(new Employee("Daisy"));
             bq.offer(new Employee("Bipasha"));

             System.out.println(bq);
             }
          }