import java.io.*;

class problem10{



          public static void main(String args[]) throws IOException{

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           problem10 obj=new problem10();
   
                System.out.println("Enter your input:");
                int a= Integer.parseInt(br.readLine());

                        separateNumber(a);
                 
              }

                 static void separateNumber(int a){
                                  int sum=0;
                                   while(a!=0){

                                      int num = a % 10;
                                      a = a / 10;

                                      sum=sum+num;

                                 
                                   

                                                        }
                                       System.out.println("Sum of individual number is "+sum);

                                                             }
                                                                   }

                                                                      