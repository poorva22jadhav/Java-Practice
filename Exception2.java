import java.util.Scanner;
class ExceptionHandling{

      


       public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter value of x");
              int x=sc.nextInt();
    
              try{
                 if(x==0){
                    throw new ArithmeticException("Divide By Zero Exception");
                         }

                System.out.println(10/x);
                  }


             catch(ArithmeticException ex){
                    System.out.println("Exception in thread");
                    System.out.println(ex);
                    System.out.println("Exception in thread "+Thread.currentThread().getName()+" ");
                    ex.printStackTrace();
                         }

            System.out.println("In end");
            
                               }
                                    }