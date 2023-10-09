interface Demo1{
          static void fun(){
                 System.out.println("In demo 1 fun");
                            }
                               }

interface Demo2{
          static void fun(){
                 System.out.println("In demo2 fun");
                            }
                               }



class Demochild implements Demo1,Demo2{
            void fun(){
               System.out.println("In demochild fun");
                       }
                 
                }

class client{
      public static void main(String args[]){
             Demochild obj= new Demochild();
             obj.fun();
             Demo1.fun();
             Demo2.fun();
                }
                       }