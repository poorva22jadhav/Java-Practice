class outer{
      Object m1(){
             System.out.println("in m1 outer");
                  

     class inner{
            void m2(){
                 System.out.println("in m2 outer");
                    }
               }
            
            return new inner();
         }
     }

class client{
      public static void main (String args[]){
             outer obj=new outer();
             obj.m1().m2();
           }
        }