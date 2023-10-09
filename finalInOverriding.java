class parent{
      final void fun(){
            System.out.println("In parent fun");
                       }
                          }

class child extends parent{
      void fun(){
           System.out.println("In child fun");
                 }
                      }

class client{
      public static void main(String args[]){
             parent obj=new child();
             obj.fun();
                         }
                               }