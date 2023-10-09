

class Demo1 extends Thread{
            public void run(){
                   
                 try{
                     Thread.sleep(2000);
                    }

                 catch(InterruptedException ie){
                      }

                   System.out.println("Thread is done with execution");
                 
                  }
                }

class ThreadDemo{
      public static void main(String args[]){
             
             Demo1 obj=new Demo1();
            
             obj.start();


             while(obj.isAlive()){
                  System.out.println("Thread is still working");
       
                  try{
                      Thread.sleep(100);
                     }

                 catch(InterruptedException ie){
                       }
             
             }

             System.out.println("Thread has finished its work");
           }
       }