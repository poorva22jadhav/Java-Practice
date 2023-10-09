import java.io.*;

class nestedFor1{
  
      public static void main (String args[])throws IOException{

                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Enter lower limit");

                 int lower=Integer.parseInt(br.readLine());

                 
                  System.out.println("Enter upper limit");

                 int upper=Integer.parseInt(br.readLine());

                 int count=0;
                 for(int i=lower;i<=upper;i++){
                      if(i%5==0 && i%2==0){
                           count++;
                           System.out.print(i+" ");
                            
                                 }

                   }
                             System.out.println("count= "+ count);

                             }
                                     }
 
