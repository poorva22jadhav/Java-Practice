class Parent{
      Object fun(){
             Object obj=new Object();
             System.out.println("object datatype");
             return new Object();
                  }
                        }
 

 /*  int fun(){
            System.out.println("Int datatype");
            return 10;
                  }
                      }
                         
 */                    

class child extends Parent{
    String fun(){
            System.out.println("String datatype");
            return "Purva";
                  }
                      }
                              

class client{
      public static void main(String args[]){
              Parent obj=new Parent();
              child obj1=new child();
              
              obj1.fun();
                        }
                             }