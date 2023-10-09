interface Demo1{
          static void fun(){
                 System.out.println("Demo1-fun");
                    }
                            }

interface Demo2{
          static void fun(){
                 System.out.println("Demo2-fun");
                   }
                      }



class Demochild implements Demo1,Demo2{                        // remove implements Demo1,Demo2 code will still run and will give same output
                public static void main(String args[]){
                            Demo1.fun();
                            Demo2.fun();
                            fun();
                                    }
 
                static void fun(){
                    System.out.println("Demochild - fun");
                                  }
                                       }

            

                
             

               
               

                   


        
