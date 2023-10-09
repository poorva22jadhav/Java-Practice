class parent{
      parent(){
            System.out.println("In parent constructor");
              }
      void fun(){
              System.out.println("In fun method");
                }

                  }

class child extends parent{
            child(){
                 System.out.println("In child constructor");
                    }

            void gun(){
                   System.out.println("In gun method");
                      }
                              }

class client{
         public static void main(String args[]){
            child obj=new child();
            obj.fun();
            obj.gun();
               }
                 }