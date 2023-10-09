interface Demo{
          void gun();

          default void fun(){
                 System.out.println("In fun Demo");
                 }
                        }

class Demochild implements Demo{
          public void gun(){
                 System.out.println("In gun Demochild");
                            }

          public void fun(){
             System.out.println("In fun Demochild");
                 }
      
               
                               }


class client{
      public static void main(String args[]){
             Demo obj=new Demochild();
             obj.fun();
             obj.gun();
                       }
                             }