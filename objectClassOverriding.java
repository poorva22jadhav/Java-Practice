class Demo{
      void fun(Object obj){
              System.out.println("object");
                          }

      void fun(String str){
               System.out.println("String");
                           }
                              }


class client{
      public static void main(String args[]){
             Demo obj=new Demo();
             obj.fun("core2web");
             obj.fun(new StringBuffer("core2web"));
             obj.fun(22);
             obj.fun(22.1234);
             obj.fun(null);
                             }
                                  }