import java.io.*;

class problem16{

           public static void main (String args[]) throws IOException{

                       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                       System.out.println("Enter no of rows");

                       int rows= Integer.parseInt(br.readLine());
 
                        int N=5;  int a=5; int a1=5;
                        for(int i=1;i<=rows;i++){

                                a=a1;
                             for(int j=1;j<=N-i+1;j++){

                                  System.out.print(i*a +" ");
                                  a--;

                                }

                                a1--;

                                System.out.println();

                                }   } }
  