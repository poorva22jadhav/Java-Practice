import java.io.*;

class nestedFor2{
  
      public static void main (String args[])throws IOException{

                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Enter start");

                 int lower=Integer.parseInt(br.readLine());

                 
                  System.out.println("Enter end");

                 int upper=Integer.parseInt(br.readLine());

                  System.out.println("composite number");

                 for(int i=lower;i<=upper;i++){
                      int count=0;
                          for(int j=1;j<=i;j++){
                                   if(i%j==0){
                                        count++;}
                                   }
                           if(count>2){
                                 System.out.println(i);}  
                   }
                           


                             }
                                     }
 
