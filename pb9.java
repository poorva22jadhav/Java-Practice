import java.io.*;

class problem9{



          public static void main(String args[]) throws IOException{

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           problem9 obj=new problem9();
   
                System.out.println("Enter first input:");
                int a= Integer.parseInt(br.readLine());

               System.out.println("Enter second input:");
               int b= Integer.parseInt(br.readLine());

                System.out.println("Enter third input:");
                int c= Integer.parseInt(br.readLine());

                averageNumber(a,b,c);

                 
              }

                 static void averageNumber(int a, int b, int c){

                                   

                                     int average = (a+b+c)/3;
                                     System.out.println("Average of given 3 numbers is "+average);
                                                  }


                                                        }