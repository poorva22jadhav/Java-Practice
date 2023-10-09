 class outer{
       int x=8;
       static int y=10;

       void method(){
             System.out.println("in outer mthod");
            
             int h=9;
             class inner{
                   static int f=7;

                   void access(){
                   System.out.println(x);
                   System.out.println(y);
                   System.out.println(h);
 
                   System.out.println(f);
                   }
                   
                  }
                  
              inner obj=new inner();
              obj.access();
           
                  }

       public static void main(String args[]){
              outer obj2=new outer();
              obj2.method();
            }
       }