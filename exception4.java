import java.util.Scanner;
class CustomException extends RuntimeException{
      CustomException(String message){
            super(message);
      }
   }

class Example{
      public static void main(String args[]){

             
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter integer value");
       
             System.out.println("0<data<100");
             
          
                int data=sc.nextInt();
                if(data>100){
                   throw new CustomException("Data should be greater than 100");
                             }

                if(data<0){
                  throw new CustomException("Data should be greater than 0");
                           }

                 
                   
             
            }
         }