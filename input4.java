import java.io.*;
import java.util.*;
 
 class program13{
             public static void main (String args[]) throws IOException{
                     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                     System.out.println("Enter employee Name,his employee id,salary and section");
                          String wholeString= br.readLine();

                     StringTokenizer obj= new StringTokenizer (wholeString,",");

                                String token1=obj.nextToken();
                                
                                int token2=Integer.parseInt(obj.nextToken());
                                float token3=Float.parseFloat(obj.nextToken());
                                 
                                char token4=(char)br.read().obj.nextToken();

                          System.out.println("Name "+token1);
                          System.out.println("Eid "+token2);
                          System.out.println("Salary "+token3);
                          System.out.println("Section "+token4);
                                      }
                                        }