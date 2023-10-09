class Demo{
      void travel(){
           System.out.println("Kerala");
                   }
          
           }

class client{
      public static void main(String args[]){
             Demo obj=new Demo(){
                  void travel(){
                       System.out.println("Everywhere");
                      }
                        };
             obj.travel();
                 }
                      }
            