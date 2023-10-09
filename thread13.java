class ThreadClass extends Thread{

     ThreadClass(ThreadGroup tg,String str){
                super(tg,str);
               }




      public void run(){
             try{
                 Thread.sleep(400);
                }

             catch(InterruptedException ie){
                   System.out.println("Thread interrupted");
                  }
             System.out.println("Hello "+Thread.currentThread().getName());
             System.out.println(Thread.currentThread());
              }

          
          }

class ThreadDemo {
       public static void main(String args[]){

       ThreadGroup tg=new ThreadGroup("Names");
       
       
      
       ThreadClass obj=new ThreadClass(tg,"poorva");
       ThreadClass obj1=new ThreadClass(tg,"Riya");
       ThreadClass obj2=new ThreadClass(tg,"Akanksha");
       
       
       obj.start();
       obj1.start();
       obj2.start();
          
      }
   }