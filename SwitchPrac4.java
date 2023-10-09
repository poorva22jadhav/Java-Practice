import java.util.Scanner;


class code3{
          public static void main (String[]args){
               
                  Scanner sc = new Scanner(System.in);
                   int mult=1;

                   System.out.println("Enter your first number");
                   int num1= sc.nextInt();

                     System.out.println("Enter your second number");
                   int num2= sc.nextInt();


                          if(num1 > 0 && num2 >0){
                                 mult=mult*num1 *num2;}


                  
                          switch(mult%2){
                                    case  0:
                                          System.out.println("Their multiplication is even");
                                          break;
                                     case  1:
                                          System.out.println("Their multiplication is odd");
                                            break;
                                     

                                   
                                  default:
                                          System.out.println("Negative number");
                                       }



                  }
                          }        