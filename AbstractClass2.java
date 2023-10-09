abstract class parent{
         void career(){
              System.out.println("Dancer");
                       }

         abstract void marry();      
                                  }


class child extends parent{
      void marry(){
           System.out.println("Aman");
               }
                          }

class client{
      public static void main(String args[]){
             
             parent obj1=new child();
             obj1.marry();
             obj1.career();
             }
                   }