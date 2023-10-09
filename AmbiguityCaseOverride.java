class Demo{
      void fun(int x,float y){
               System.out.println("In int float para");
                           }

      void fun(float x,int y){
              System.out.println("In float int para");
                              }

                                  }


class client{
      public static void main(String args[]){
             Demo obj=new Demo();
             obj.fun(10,10);
                           }
                                 }