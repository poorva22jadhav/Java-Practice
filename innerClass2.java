class outer{
      class inner{
             void m1(){
                  System.out.println("In inner m1 method");
                    }
           }
 

         void m1(){
                 System.out.println("In outer m1");
                  }
                      

               public static void main(String args[]){
                 
                    outer obj1=new outer();
                    obj1.m1();

                    inner obj=new outer().new inner();
                    obj.m1();

                              
                                   }
                                         }
                    



                    