class Demo{
      Demo(){
              System.out.println("In constructor Demo");
            }
                   }

class Demochild extends Demo{
         Demochild(){
             System.out.println("In constructor demochild ");
                     }
                        }

class parent{
      parent(){
            System.out.println("In parent constructor");
              }

     Demo m1(){
           System.out.println("In m1-parent");
           return new Demo();
              }

                   }

class child extends parent{
      child(){
           System.out.println("In child constructor");
             }

      Demochild m1(){
          System.out.println("In m1-child");
          return new Demochild();
                        }
                            }


class client{
      public static void main(String args[]){
             parent p=new child();
             p.m1();
                     }
                          }
