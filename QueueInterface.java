import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

class QueueExample{
      public static void main(String args[]){
             Queue<Integer> qu=new ArrayDeque<>();

             qu.offer(10);
             qu.offer(20);
             qu.offer(30);
             qu.offer(40);


            qu.poll();
            qu.offer(60);

            int head=qu.peek();
            System.out.println(head);

            System.out.println(qu);

             }
                 }