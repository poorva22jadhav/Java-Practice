class MyThread extends Thread{
      private String name;

      public MyThread(String name){
             this.name=name;
             }

      public void run(){
             for(int i=0;i<=5;i++){
                 System.out.println("Thread "+name+": count"+i);

                 try{
                     Thread.sleep(1000);
                    }

                 catch(InterruptedException ie){
                       ie.printStackTrace();
                      }
                    }
                  }
                }

class ThreadDemo{
      public static void main(String args[])throws InterruptedException{
            MyThread t1=new MyThread("A");
            t1.start();
            t1.join();
            MyThread t2=new MyThread("B");
            t2.start();
            t2.join(200);

           for(int i=0;i<=5;i++){
              System.out.println("In Main Thread");
                                 }

         }
                              
                       }