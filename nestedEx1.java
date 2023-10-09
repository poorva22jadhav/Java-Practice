import java.io.*;

class problem12{

              public static void main(String args[]) throws IOException{
                      
                       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                       System.out.println("Enter no of rows");
                       
                        int rows = Integer.parseInt(br.readLine());
 
                       
                         for(int i=1;i<=rows;i++){
                                   char ch='A';  char ch1='D';
                                    int num= 1;   int num1=4;
                          

                             for(int j=1;j<=4;j++){

                                      if(i%2==1){

                                       System.out.print(ch1);
                                       System.out.print(num1 +" ");

                                       ch1--;
                                       num1--;

                                       }

                                       else{
                                            System.out.print(ch);
                                            System.out.print(num+ " ");

                                            ch++;
                                            num++;

                                            }

                                                 }

                                          System.out.println();
                                                         }}}

                               