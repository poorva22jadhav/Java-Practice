import java.io.*;
import java.util.*;
 
 class program13{
             public static void main (String args[]) throws IOException{
                     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                     System.out.println("Enter Match MatchNo and name");
                          String wholeString= br.readLine();

                     StringTokenizer obj= new StringTokenizer (wholeString,",");

                                String token1=obj.nextToken();
                                String token2=obj.nextToken();
                                String token3=obj.nextToken();

                          System.out.println("Match"+token1);
                          System.out.println("MatchNo"+token2);
                          System.out.println("name"+token3);

                                      }
                                        }