interface Demo1{
          default void fun(){
                   System.out.println("In-fun demo");
                              }
                                    }

interface Demo2{
          default void fun(){
                  System.out.println("In fun demo2");
                             }
                                }


class Demochild implements Demo1,Demo2{
                       }

class client{
      public static void main(String args[]){
              Demochild obj=new Demochild();
              obj.fun();
               }
                     }