class parent{
      parent(){
            System.out.println("In parent constructor");
               }

      void property(){
           System.out.println("Money,car,Bunglow");
                  }
  
      void marry(){
            System.out.println("Nishant");
                   }
                        }

class child extends parent{
      child(){
           System.out.println("In child constructor");
              }

      void marry(){
           System.out.println("Noone");
                }
                        }

class client{
    public static void main(String args[]){
      child obj = new child();
      obj.property();
      obj.marry();
          }
                  }