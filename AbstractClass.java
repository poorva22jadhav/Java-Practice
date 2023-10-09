abstract class parent{
          
        parent(){
             System.out.println("IN parent constructor");
                 }
      
         void career(){ 
              System.out.println("Songwriter");
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
      parent obj=new child();
      obj.marry();
                    }
      
                  }