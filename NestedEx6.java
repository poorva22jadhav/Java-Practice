import java.io.*;
import java.util.*;
 

class problem20{

             public static void main(String[]args) throws IOException{

                     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                     System.out.println("input:");


                     

                     String str=br.readLine();

                      
                      StringTokenizer token = new StringTokenizer(str," ");
                               

                      String ch1=token.nextToken();
                         
                      String ch2=token.nextToken();

                     
                      
                      int difference= ch2-ch1;

                      System.out.println(difference);

                      System.out.println("output:The difference between a and p is ");
                     

                     }

                        }