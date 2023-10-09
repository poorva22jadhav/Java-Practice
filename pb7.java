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

          

                smallNumber(a,b,c);
            
              }


             static void smallNumber(int a,int b, int c){
                  



                 if(a < c &&  a < b){
                       System.out.println("Smallest Number is "+a);
                                }  

                else if(b < a &&  b < c){
                       System.out.println("Smallest Number is "+b);
                                } 

                 else if(c < a &&  c < b){
                       System.out.println("Smallest Number is "+c);
                                } 

                else{
                       System.out.println("All numbers are same");
                    }



                  }  
              
               

                         

                    }