import java.io.*;

class problem7{
          public static void main(String args[]) throws IOException{

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              
                System.out.println("Enter first input:");
                int a= Integer.parseInt(br.readLine());

               System.out.println("Enter second input:");
               int b= Integer.parseInt(br.readLine());

                System.out.println("Enter third input:");
                int c= Integer.parseInt(br.readLine());



                 if(a < c &&  b < c){
                       System.out.println("Biggest Number is "+c);
                                }  

                else if(a < b &&  c < b){
                       System.out.println("Biggest Number is "+b);
                                } 

                 else if(b < a &&  c < a){
                       System.out.println("Biggest Number is "+a);
                                } 

                else{
                       System.out.println("All numbers are same");
                    }  
              }