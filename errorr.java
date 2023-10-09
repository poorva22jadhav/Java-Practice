
class demo1{


         demo1(){
           System.out.println("Constructor");
         }

        void method1(){
                 System.out.println("Method 1");
                 
              }

       static demo1 var;
         

         public static void main(String args[]){
         var=new demo1();
         var.method1();
          }


      
      }



