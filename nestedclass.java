class outer{
       static int y=20;
       class inner{
            static int x=6;
            void m1(){
                 System.out.println("In m1 inner");
                      }
           }
             }

class client{
      public static void main(String args[]){
            
             outer obj=new outer();
             outer.inner obj1=obj.new inner();
             System.out.println(outer.y);
             System.out.println(outer.inner.x);
             System.out.println(obj1);
                
             
             obj1.m1();
       }
          }