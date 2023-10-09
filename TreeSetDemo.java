import java.util.*;

class Myclass implements Comparable{
      String str;
   
      Myclass(String str){
             this.str=str;
           }

      public int CompareTo(Myclass obj){
             return 1;
             
             }


       }

class setDemo{
 public static void main(String args[]){
               TreeSet ts=new TreeSet();
             
               ts.add(10);
               ts.add(new Myclass("kanha"));
               ts.add(new Myclass("Ashish"));
               ts.add(new Myclass("Rahul"));
               ts.add(new Myclass("Satish"));
               System.out.println(ts);
               }

               
               
        
    }