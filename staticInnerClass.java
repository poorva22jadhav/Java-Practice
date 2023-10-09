class outer{

  
     static class inner{
             void m1(){
                  System.out.println("In Inner m3 method");
                      }


                        }
 

         void m2(){
                 System.out.println("In outer m1");
                  }
                     


               public static void main(String args[]){
                   
                    outer.inner obj=new outer.inner();
                    obj.m1();
                 
                    outer obj1=new outer();
                    
                    obj1.m2();

                    

                                }
                                       
                                           }
                    



                    