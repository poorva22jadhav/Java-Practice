class parent{
      static void fun(){
             System.out.println("In parent fun");
               }
                   }

class child extends parent{
       static void fun(){
             System.out.println("In child fun");
             }
                    }


class client{
      public static void main(String args[]){
             parent obj=new parent();
             child obj2=new child();
             parent obj3=new child();
             obj.fun();
             obj2.fun();
             obj3.fun();
                         }
                            }


             