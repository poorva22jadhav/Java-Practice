import java.io.*;

class problem6{
      public static void main(String args[])throws IOException{
              
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Input a number:");
      int x = Integer.parseInt(br.readLine());
       System.out.println("Expected Output:");
      for(int i=1;i<11;i++){
            
             System.out.println(x+"*"+i+"="+(x*i));
                           }

                                }
                                     }
