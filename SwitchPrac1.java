import java.util.Scanner;


class code1{
          public static void main (String[]args){
               
                  Scanner sc = new Scanner(System.in);
                  int sum=0;

                   System.out.println("Marks in TOC:");
                   int TOC= sc.nextInt();

                   System.out.println("Marks in DBMS:");
                   int DBMS= sc.nextInt();


                   System.out.println("Marks in IOT:");
                   int IOT= sc.nextInt();



                  System.out.println("Marks in HCI:");
                   int HCI= sc.nextInt();


                   System.out.println("Marks in CNS:");
                   int CNS= sc.nextInt();



                   
                         sum=sum+TOC+DBMS+IOT+HCI+CNS;

                    
           System.out.println("your total marks are" + sum);

                               
                          switch(sum >){
                                    case  70:
                                          System.out.println("You got first class");
                                       }



                  }
                          }        