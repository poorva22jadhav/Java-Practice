interface Demo{
          void fun();
          void gun();
        }

class child implements Demo{

      child(){
           System.out.println("In child constructor");
              }

      public void fun(){
             System.out.println("In fun");
             }

      public void gun(){
             System.out.println("In gun");
              }

                        }


class client{
     public static void main(String args[]){
            Demo obj = new child();
            obj.fun();
            obj.gun();
                        }
                           }

