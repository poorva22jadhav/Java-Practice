class outer{

   void m1(){
      class inner{
             void m3(){
                  System.out.println("In Inner m3 method");
                      }


                        }
      inner obj=new inner();
      obj.m3();

 
                 }
 

         void m2(){
                 System.out.println("In outer m1");
                  }
                     }
class client{ 

               public static void main(String args[]){
                 
                    outer obj1=new outer();
                    obj1.m1();
                    obj1.m2();

                    

                                }
                                       
                                           }
                    



                    