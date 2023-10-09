import java.util.Scanner;


class code2{
          public static void main (String[]args){
               
                  Scanner sc = new Scanner(System.in);
                  

                   System.out.println("Enter number between 0 and 5");
                   int number= sc.nextInt();

                  
                          switch(number){
                                    case  0:
                                          System.out.println("Zero");
                                          break;
                                     case  1:
                                          System.out.println("one");
                                            break;
                                     case  2:
                                          System.out.println("two");
                                           break;

                                   case  3:
                                          System.out.println("three");
                                          break;

                                    case  4:
                                          System.out.println("four");
                                          break;

                                       case  5:
                                          System.out.println("five");
                                          break;

                                  default:
                                          System.out.println("You have enter the number which is greater than 5");
                                       }



                  }
                          }        