interface Demo{
          int x=10;
          void fun();
              
        }


class Demochild implements Demo{
      public void fun(){
             int x=12;                // can override but cannot change value like x=4;
             System.out.println(x);
             
             System.out.println(Demo.x);
                      }
                            }


class client{
      public static void main(String args[]){
             Demo obj=new Demochild();
             obj.fun();
                        }
                            }
