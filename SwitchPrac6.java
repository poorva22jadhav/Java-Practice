import java.util.Scanner;


class code4{
          public static void main (String[]args){
               
                  Scanner sc = new Scanner(System.in);
                  

                   System.out.println("What's your interest?");

                    System.out.println("1.Movies");
                    System.out.println("2.Series");
                   int number= sc.nextInt();

                  

                               
                          switch(number){
                                    case 1:
                                          System.out.println("Movies You wish to watch today");
                                          System.out.println("1.Little Woman");
                                          System.out.println("2.Intersteller");
                                          System.out.println("3.Good Will Hunting");
                                          System.out.println("4.Dead Poets Society");
                                          break;


                                    case 2:
                                          System.out.println("Best Series to watch");
                                          System.out.println("1.My Name");
                                          System.out.println("2.Peaky Blinders");
                                          System.out.println("3.The Office");
                                          System.out.println("4.Dead Poets Society");
                                          break;
                           
                                    default:
                                                  System.out.println("Enter correct number");   
 

                                       }



                  }
                          }        