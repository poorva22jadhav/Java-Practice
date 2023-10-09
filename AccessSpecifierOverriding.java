class Parent{
       public void fun(){                          //if we write private void fun() it would not be an overriding scenario inheritance wont happen as 
             System.out.println("Parent fun");     //as private class cannot be inherited
                        }
                           }

class child extends Parent{
       /* public*/ void fun(){
            System.out.println("Child fun");
                  }
                        }


class client{
      public static void main(String args[]){
             Parent obj=new Parent();
             obj.fun();
                        }
                           }