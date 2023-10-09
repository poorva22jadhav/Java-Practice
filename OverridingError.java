class parent{
    
      int fun(){
           System.out.println("parent fun");
           return 20;
                  }
                    }


class child extends parent{
      char fun(){
          System.out.println("child fun");
           return 'A';
                }
                   }

class client{
      public static void main(String args[]){
             parent p=new parent();
             child a=new child();
             //p.fun();
             a.fun();
                        }
                           }
