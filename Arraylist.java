import java.util.*;

class ArrayListDemo{
      public static void main(String args[]){
             ArrayList demo=new ArrayList();
             demo.add(10);
             demo.add(20);
             demo.add("poorva");
             System.out.println(demo.size());
             System.out.println(demo.contains(10));

             //gives index of an element
             System.out.println(demo.indexOf("poorva"));

             //gets element at given index
             System.out.println(demo.get(2));
             
             //replaces the element at the given index and returns popped value 
             System.out.println(demo.set(1,"riya"));

              System.out.println(demo.add("Akanksha"));
             System.out.println(demo.remove(3));

             //Most important method
             Object[] array = demo.toArray();
             for (Object i:array){
                  System.out.println(i);
               }
             


             
            
         }
     }