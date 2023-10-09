import java.io.*;

class problem5{
          public static void main(String args[]) throws IOException{
                 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                 
                  System.out.println("Input first number:");
                  int x= Integer.parseInt(br.readLine());

                   System.out.println("Input second number:");
                  int y= Integer.parseInt(br.readLine()); 


                    

                      System.out.println(+x+"+"+y+"="+(x+y));
                      System.out.println(+x+"*"+y+"="+(x-y));
                      System.out.println(+x+"*"+y+"="+(x*y));
                      System.out.println(+x+"*"+y+"="+(x/y));
                      System.out.println(+x+"*"+y+"="+(x%y));
              }
              
               

                         

                    }