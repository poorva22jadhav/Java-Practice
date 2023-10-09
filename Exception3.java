import java.io.IOException;

class Example{
      public void method1() throws IOException{
              throw new IOException("Io exception occurred");
               }

      public void method2()throws IOException{
             method1();
          }

      public void method3()throws IOException{

               method2();
             /*try{
                 method2();
               }

             catch(IOException e){
                  System.out.println("Resolved");
                 }

             finally{
                 System.out.println("Connection closed");
           }

            */
         }

      public static void main(String args[])throws IOException{
             Example ex=new Example();
             ex.method3();
           }
         }